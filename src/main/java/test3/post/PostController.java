package test3.post;

import test3.Reply;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {


    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private Scanner sc = new Scanner(System.in);
    private int latestId = 4;
    private int lastReplyId = 1;
    ArrayList<Reply> replies = new ArrayList<>();

    public PostController() {
        Post p1 = new Post(1, "안녕하세요. 반갑습니다. java 공부중이에요", "", getCurrentDateTime(), 0);
        Post p2 = new Post(2, " java 질문좀 할게요~", "", getCurrentDateTime(), 0);
        Post p3 = new Post(3, "정처기 따야되나요?", "", getCurrentDateTime(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }


    public String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }


    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();

        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(latestId, title, body, getCurrentDateTime(), 0);
        postRepository.save(post);

        System.out.println("게시물이 등록되었습니다.");
        latestId++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = getParsedInt(sc.nextLine(), -1);

        if(targetId == -1) {
            return;
        }

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.print("새로운 제목 : ");
        String newTitle = sc.nextLine();

        System.out.print("새로운 내용 : ");
        String newBody = sc.nextLine();

        post.setTitle(newTitle);
        post.setBody(newBody);

        System.out.printf("%d번 게시물이 수정되었습니다.", targetId);
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = getParsedInt(sc.nextLine(), -1);

        if(targetId == -1) {
            return;
        }

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        postRepository.delete(post);
        System.out.printf("%d번 게시물이 삭제되었습니다.", targetId);
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력 해주세요 : ");

        // try = catch를 최대한 사용 안하는게 좋긴 함
        // 몇가지 상황을 제외하고는 try = catch 사용 안하고 if로 처리 다 가능함.

        int targetId = getParsedInt(sc.nextLine(), -1);

        if(targetId == -1) {
            return;
        }

        System.out.println("==============");
        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.increasHit();
        ArrayList<Reply> replies = getRepliesByPostId(post.getId());
        postView.printPostdetail(post, replies);
        detailProcess(post);
    }

    public void detailProcess(Post post) {
        while (true) {
            System.out.print("상세보기 기능을 선택해주세요 : (1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int targetNo = getParsedInt(sc.nextLine(), -1);

            if(targetNo == -1) {
                return;
            }

            if (targetNo == 1) {
                addReply(post);
            } else if (targetNo == 2) {
                System.out.println("추천");
            } else if (targetNo == 3) {
                System.out.println("수정");
            } else if (targetNo == 4) {
                System.out.println("삭제");
            } else if (targetNo == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            }
        }
    }

    // 댓글기능
    public void addReply(Post post) {
        System.out.print("댓글 내용을 입력해주세요 : ");
        String body = sc.nextLine();
        String regDate = getCurrentDateTime();
        int postId = post.getId();

        Reply reply = new Reply(lastReplyId, postId, regDate, body);
        replies.add(reply);
        System.out.println("댓글이 성공적으로 등록되었습니다.");
        ArrayList<Reply> replies = getRepliesByPostId(post.getId());
        postView.printPostdetail(post, replies);
        lastReplyId++;
    }

    public ArrayList<Reply> getRepliesByPostId(int postId) {
        ArrayList<Reply> searchedReplies = new ArrayList<>();
        for (Reply reply : replies) {
            if (reply.getPostId() == postId) {
                searchedReplies.add(reply);
            }
        }
        return searchedReplies;
    }


    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> searchedPostList = new ArrayList<>();
        ArrayList<Post> posts = postRepository.getPosts();
        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }
        if (searchedPostList.size() == 0) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            postView.printPostList(searchedPostList);
        }
    }

    public void signup() {
        System.out.println("=== 회원가입을 진행합니다 ===");
        System.out.println("아이디를 입력해주세요 : ");
        String userid = sc.nextLine();

        System.out.println("비밀번호를 입력해주세요 : ");
        String userPass = sc.nextLine();

        System.out.println("닉네임을 입력해주세요 : ");
        String nickName = sc.nextLine();

    }


    // 숫자 예외처리 하는법
    public int getParsedInt(String value, int defaultValue) {

        try {
            int parsedInt = Integer.parseInt(value);
            return parsedInt;

        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해주세요.");
        }
        return defaultValue;
    }



}
