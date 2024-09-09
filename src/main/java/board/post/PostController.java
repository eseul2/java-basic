package board.post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {

    private PostRepository postRepository = new PostRepository();
    private PostView postView =new PostView();
    private Scanner sc = new Scanner(System.in);
    private int lastestId = 4;

    public PostController() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "", getCurrentTime(), 0);
        Post p2 = new Post(2, "java 질문좀 할게요~", "", getCurrentTime(), 0);
        Post p3 = new Post(3, "정처기 따야되나요?", "", getCurrentTime(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);

    }

    public String getCurrentTime() {
        // 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 원하는 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // 포맷 적용하여 출력하기
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }



    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();

        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(lastestId, title, body, getCurrentTime(), 0);
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

        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("없는 게시물 입니다.");
            return;
        }
        System.out.print("새로운 제목 : ");
        String newTitle = sc.nextLine();

        System.out.print("새로운 내용 : ");
        String newBody = sc.nextLine();

        post.setTitle(newTitle);
        post.setBody(newBody);
        System.out.printf("%d번 게시물이 저장되었습니다.", post.getId());

    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 입니다.");
            return;
        }

        postRepository.delete(post);
        System.out.printf("%d번 게시물이 삭제 되었습니다.", targetId);
    }


    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> searchedPostList = postRepository.getPostsByKeyword(keyword);
        postView.printPostList(searchedPostList);
    }


    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        System.out.println("==================");

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.increaseHit();
        postView.printPostDetail(post);

    }

}
