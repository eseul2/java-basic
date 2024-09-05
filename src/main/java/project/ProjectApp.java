package project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectApp {


    ArrayList<Membership> memberships = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    int lastesId = 4;//가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획.
    private String loggedInId = null;
    private String loggedInNickname = null;

    PostRepository postRepository = new PostRepository();
    // 얘가 Post 창고를 가지고 있어서 객체 새로 생성


    // 값의 초기화는 대부분 생성자에서 해주는 것을 권장한다. 다양한 로직 수행 가능.
    public ProjectApp() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "", "홍길동", getcurrentDateTime(), 0);
        Post p2 = new Post(2, "java 질문좀 할게요~", "", "홍길동", getcurrentDateTime(), 0);
        Post p3 = new Post(3, "정처기 따야되나요?", "", "홍길동", getcurrentDateTime(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    public void start() {


        while (true) {
            if (loggedInId != null && loggedInNickname != null) {
                System.out.printf("명령어를 입력해주세요[%s(%s)] : ", loggedInId, loggedInNickname);
            } else {
                System.out.print("명령어 : ");
            }
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
                serch();
            } else if (command.equals("signup")) {
                singup();
            } else if (command.equals("login")) {
                login();
            }
        }
    }


    private void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        printPostList(posts);
    }

    private void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(lastesId, title, body, loggedInNickname, getcurrentDateTime(), 0);
        postRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastesId++;    // 다음 게시물의 id를 부여하기 위해 1증가!
    }

    private void update() {
        System.out.println("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        System.out.println("새로운 제목 : ");
        String newTitle = sc.nextLine();
        System.out.println("새로운 내용 : ");
        String newBody = sc.nextLine();
        post.setTitle(newTitle);
        post.setBody(newBody);
        System.out.println("게시물이 수정되었습니다.");
        return;
    }

    private void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        postRepository.delete(post);
        System.out.println("삭제가 완료되었습니다.");
    }

    private void detail() {
        System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물입니다.");
            return;
        }
        post.increaseview();
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("작성자 : %s\n", post.getAuthor());
        System.out.printf("조회수 : %s\n", post.getView());
        System.out.printf("좋아요 : %s %d\n", post.getLikeCount() > 0 ? "♥" : "♡", post.getLikeCount());
        System.out.println("=================");

        System.out.println("====== 댓글 =====");
        for (Comment comment : post.getComments()) {
            System.out.println(comment);
        }


        while (true) {
            System.out.print("상세보기 기능을 선택해주세요. 1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로 :");
            int targetNo = Integer.parseInt(sc.nextLine());
            if (targetNo == 1) {
                System.out.println("===== 댓글 =====");
                System.out.print("댓글 내용 : ");
                String comment = sc.nextLine();
                post.addComment(comment);
                System.out.println("댓글이 성공적으로 등록되었습니다.");
            } else if (targetNo == 2) {
                if (loggedInId == null) {
                    System.out.println("로그인이 필요합니다.");
                    continue;
                }
                if (post.getLikes().contains(loggedInId)) {
                    post.removeLike(loggedInId);
                    System.out.println("좋아요가 취소되었습니다.");
                } else {
                    post.addLike(loggedInId);
                    System.out.println("해당 게시물을 좋아합니다.");
                }
                System.out.printf("좋아요 : %s %d\n", post.getLikeCount() > 0 ? "♥" : "♡", post.getLikeCount());
            } else if (targetNo == 3) {
                if (post.getAuthor() == null || !post.getAuthor().equals(loggedInNickname)) {
                    System.out.println("자신의 게시물만 수정/삭제할 수 있습니다.");
                    return;
                } else {
                    System.out.println("새로운 제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.println("새로운 내용 : ");
                    String newBody = sc.nextLine();
                    post.setTitle(newTitle);
                    post.setBody(newBody);
                    System.out.println("게시물이 수정되었습니다.");
                }

            } else if (targetNo == 4) {
                System.out.println("정말 삭제하시겠습니까? (y / n) : ");
                String confirm = sc.nextLine();
                if (confirm.equals("y")) {
                    postRepository.delete(post);
                    System.out.printf("%s님의 %d번 게시물을 삭제했습니다.\n", post.getAuthor(), post.getId());
                    ArrayList<Post> posts = postRepository.getPosts();
                    printPostList(posts);
                }


            } else if (targetNo == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            }
        }
    }

    private void serch() {
        System.out.println("검색 키워드를 입력해주세요 : ");
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


    private void singup() {
        System.out.println("==== 회원가입을 진행합니다. ====");
        System.out.print("아이디를 입력해주세요 : ");
        String logInid = sc.nextLine();   // 고객아이디 변수명 기억@!!!!

        System.out.print("비밀번호를 입력해주세요 : ");
        String pass = sc.nextLine();   // 고객 비밀번호

        System.out.println("닉네임을 입력해주세요 : ");
        String nickname = sc.nextLine();    // 고객 닉네임

        Membership membership = new Membership(logInid, pass, nickname);
        memberships.add(membership);


        System.out.println("회원가입이 완료되었습니다.");
    }

    public void login() {
        System.out.print("아이디 : ");
        String logInId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pass = sc.nextLine();

        for (Membership membership : memberships) {
            if (membership.getLogInId().equals(logInId) && membership.getPass().equals(pass)) ;
            loggedInId = logInId;    // 로그인한 유저 id 저장
            loggedInNickname = membership.getNickname();
            System.out.printf("%s님 환영합니다!\n", membership.getNickname());
            return;
        }
        System.out.println("로그인 실패 ");
    }


    // 찾겠다. 포스트를. 아이디로
// 만약 내가 찾고자 하는 게시물이 없다면?
    public Post findPostById(int id) {
        ArrayList<Post> posts = postRepository.getPosts();
        printPostList(posts);
        for (Post post : posts) {
            if (post.getId() == id) {         //항상 찾는 값이 바뀔테니까 매개변수 값을 입력해준다.
                return post;                 // return을 만나면 메서드는 그 즉시 종료
            }
        }
        return null;
    }

    public String getcurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 원하는 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // 포맷 적용하여 출력하기
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }


    // 서치 기능
    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==================");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.printf("작성자 : %s\n", post.getAuthor());
            System.out.println("==================");

        }
    }


}
// 코드 줄이 너무 길어서 각 기능을 함수화 할것임
// 가독성이 좋아지고 재활용성
// 지역변수(함수에서만 사용하고 버림)
// 외부에 영향을 최소화



//mvc