package project.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {


    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private Scanner sc = new Scanner(System.in);
    private int lastestId = 4;
    private int lastReplyId = 1; // 댓글 번호

    ArrayList<Reply> replies = new ArrayList<>();

    public PostController() {
        Post p1 = new Post(1, "안녕하세여 java", "", getCurrentDateTime(), 0);
        Post p2 = new Post(2, "java 질문좀여", "", getCurrentDateTime(), 0);
        Post p3 = new Post(3, "정처기 따야하나여?", "", getCurrentDateTime(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    public void add() {
        System.out.print("게시물 제목을 입력하세요 : ");
        String title = sc.nextLine();

        System.out.print("게시물 내용을 입력하세요 :");
        String body = sc.nextLine();

        Post post = new Post(lastestId, title, body, getCurrentDateTime(), 0);
        postRepository.save(post);

        System.out.println("게시물이 등록되었습니다.");
        lastestId++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        System.out.print("새로운 제목 : ");
        String newTitle = sc.nextLine();
        System.out.print("새로운 내용 : ");
        String newBody = sc.nextLine();
        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.setTitle(newTitle);
        post.setBody(newBody);
        System.out.printf("%d번 게시물이 수정되었습니다.\n", targetId);
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        postRepository.delete(post);
        System.out.printf("%d번 게시물이 삭제되었습니다.", targetId);
    }


    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.increaseHit();
        ArrayList<Reply> replies= getRepliesByPostId(post.getId());
        postView.printPostDetail(post,replies);
        doDetailProcess(post);  // while문을 함께 넣으면 너무 길어져서 따로 메서드를 만들어서 출력!!
    }

    public void doDetailProcess(Post post) {
        while(true) {
            System.out.print("상세보기 기능을 선택해주세요. (1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int targetNo = Integer.parseInt(sc.nextLine());

            if(targetNo == 1) {
                addReply(post);
            }
            else if(targetNo ==2) {
                System.out.println("추천");
            }
            else if(targetNo == 3) {
                System.out.println("수정");
            }
            else if(targetNo == 4) {
                System.out.println("삭제");
            }
            else if(targetNo == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            }



        }
    }

    // 댓글등록
    public void addReply(Post post) {
        System.out.print("댓글 내용을 입력해주세요 : ");
        String rbody = sc.nextLine();
        String regDate = getCurrentDateTime();
        int postId = post.getId();

        Reply  reply =new Reply(lastReplyId,postId,rbody,regDate);
        replies.add(reply);

        System.out.println("댓글이 성공적으로 등록되었습니다.");
        ArrayList<Reply> replies = getRepliesByPostId(post.getId());
        postView.printPostDetail(post,replies);
        lastReplyId++;
    }


    // 댓글을 가져와라. 뭘로?? post id로 가져와라!!
    // 댓글 게시물을 탐색. board serch랑 똑같은 구조임
    public ArrayList<Reply> getRepliesByPostId(int postId) {
        ArrayList<Reply> searchedReplise = new ArrayList<>();
        for(Reply reply : replies) {
           if(reply.getPostId() == postId){
               searchedReplise.add(reply);
           }
        }
        return searchedReplise;
    }


    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();
        ArrayList<Post> searchedPostList = postRepository.getPosteByKeword(keyword);
        postView.printPostList(searchedPostList);
    }

    public String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formatterdDateTime = currentDateTime.format(formatter);
        return formatterdDateTime;
    }


}
