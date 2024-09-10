package test2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    Scanner sc = new Scanner(System.in);
    int latestId = 4;
    PostRepository postRepository = new PostRepository();

    public BoardApp() {

        Post p1 = new Post(1, "안녕하세여 반가워여 java 공부중입니다", "", getCurrentDateTime(), 0);
        Post p2 = new Post(2, "java 질문이요~", "", getCurrentDateTime(), 0);
        Post p3 = new Post(3, "정처기 따야되나여?", "", getCurrentDateTime(), 0);

        postRepository.save(p1);
        postRepository.save(p1);
        postRepository.save(p1);
    }

    public void run() {


        while (true) {
            System.out.print("명령어를 입력해주세요 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("update")) {
                update();
            } else if (command.equals("delete")) {
                delete();
            } else if (command.equals("detail")) {
                detail();
            } else if (command.equals("search")) {
                search();
            }
        }
    }


    public String getCurrentDateTime() {
        LocalDateTime curruentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = curruentDateTime.format(formatter);
        return formattedDateTime;
    }

    public void printPostList(ArrayList<Post> postList) {
        System.out.println("==============");
        for (Post post : postList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("==============");
        }
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 제목을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(latestId, title, body, getCurrentDateTime(), 0);
        postRepository.save(post);

        System.out.println("게시물이 등록되었습니다.");
        latestId++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        printPostList(posts);
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.print("새로운 제목 : ");
        String newTitle = sc.nextLine();
        System.out.print("새로운 제목 : ");
        String newBody = sc.nextLine();

        post.setTitle(newTitle);
        post.setBody(newBody);

        System.out.printf("%d번 게시물이 수정되었습니다.", targetId);
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
        System.out.print("상세보기 할 게시물 번호를 입력 해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        System.out.println("=================");
        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.increaseHit();
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("조회수 : %d\n", post.getHit());
        System.out.println("=================");
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> posts = postRepository.getPosts();
        ArrayList<Post> searchedPostList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }
        printPostList(searchedPostList);
    }
}



