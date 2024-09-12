package lateee.post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {


    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private Scanner sc = new Scanner(System.in);
    int latseteId = 4;
    int lastId = 1;

    ArrayList<Reply> replies =new ArrayList<>();


    public PostController() {
        Post2 p1 = new Post2(1, "안녕 java", "", getCurrentDateTime(), 0);
        Post2 p2 = new Post2(2, "java 질문이욤", "", getCurrentDateTime(), 0);
        Post2 p3 = new Post2(3, "정처기 따야되나여?", "", getCurrentDateTime(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }


    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();
        Post2 post2 = new Post2(latseteId, title, body, getCurrentDateTime(), 0);
        postRepository.save(post2);
        System.out.println("게시물이 등록되었습니다.");
        latseteId++;
    }

    public void list() {
        ArrayList<Post2> post2s = postRepository.getPost2s();
        postView.printPostList(post2s);
    }

    public void update() {
        System.out.print("수정할 게시물 번호를 선택해주세요 :");
        int targetId = Integer.parseInt(sc.nextLine());
        Post2 post2 = postRepository.findPostById(targetId);
        if (post2 == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        System.out.print("새로운 제목 : ");
        String newTitle = sc.nextLine();
        System.out.println("새로운 내용 : ");
        String newBody = sc.nextLine();
        post2.setTitle(newTitle);
        post2.setBody(newBody);
        System.out.printf("%d번 게시물이 저장되었습니다.", targetId);
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호를 입력 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post2 post2 = postRepository.findPostById(targetId);
        if (post2 == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        postRepository.delete(post2);
        System.out.printf("%d번 게시물이 삭제되었습니다.", targetId);
    }

    public void detail() {
        System.out.print("상세보기 할 번호를 입력 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        System.out.println("==============");
        Post2 post2 = postRepository.findPostById(targetId);
        if (post2 == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post2.increseHit();
        ArrayList<Reply> replies = getRepliesByPost2Id(post2.getId());
//        postView.postListDetail(post2,replies);
        detailProcess(post2);
    }

    public void detailProcess(Post2 post2) {
        while(true) {
            System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) :");
            int targetNo = Integer.parseInt(sc.nextLine());

            if(targetNo == 1) {
                addrePly(post2);
            }
            else if(targetNo == 2) {
                System.out.println("추천~");
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

    public void addrePly(Post2 post2) {
        System.out.print("댓글 내용 : ");
        String body = sc.nextLine();
        int post2Id = post2.getId();
        String regDate = getCurrentDateTime();
        Reply reply = new Reply(lastId,post2Id,body,regDate);
        replies.add(reply);
        System.out.println("댓글이 성공적으로 등록되었습니다.");
        lastId++;
    }



    public ArrayList<Reply> getRepliesByPost2Id (int post2Id) {
        ArrayList<Reply> searchedReplies = new ArrayList<>();
        for(Reply reply : replies) {
            if(reply.getPost2Id() == post2Id) {
                searchedReplies.add(reply);
            }
        }
        return searchedReplies;
    }




    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post2> searchedPostList = new ArrayList<>();
        ArrayList<Post2> post2s = postRepository.getPost2s();

        for (Post2 post2 : post2s) {
            if (post2.getTitle().contains(keyword)) {
                searchedPostList.add(post2);
            }
        }
        if (searchedPostList.size() == 0) {
            System.out.println("검색결과가 없습니다.");
        } else {
            postView.printPostList(searchedPostList);
        }
    }

    public String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }


}



