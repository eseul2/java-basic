package project.post;

import project.Comment;
import project.membership.Membership;
import project.Paging;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PostController implements Serializable {

    private PostRepository postRepository = new PostRepository();
    // 얘가 Post 창고를 가지고 있어서 객체 새로 생성
    Scanner sc = new Scanner(System.in);
    PostView postView = new PostView();
    private String loggedInId = null;
    private String loggedInNickname = null;
    ArrayList<Membership> memberships;


    int lastesId;//가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획.


    public PostController() {

        memberships = new ArrayList<>();
        loadDate();

        if (postRepository.getPosts().isEmpty()) {
            Post p1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "", "홍길동", getcurrentDateTime(), 0);
            Post p2 = new Post(2, "java 질문좀 할게요~", "", "홍길동", getcurrentDateTime(), 0);
            Post p3 = new Post(3, "정처기 따야되나요?", "", "홍길동", getcurrentDateTime(), 0);

            postRepository.save(p1);
            postRepository.save(p2);
            postRepository.save(p3);
            lastesId = 4;

        }
    }

    public void exit() {
        saveDate();  // 프로그램 종료 전 데이터 저장
        System.out.println("프로그램을 종료합니다.");
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(lastesId, title, body, loggedInNickname, getcurrentDateTime(), 0);
        postRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastesId++;    // 다음 게시물의 id를 부여하기 위해 1증가!
    }

    public void update() {
        System.out.println("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);

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

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        postRepository.delete(post);
        System.out.println("삭제가 완료되었습니다.");
    }

    public void detail() {
        System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물입니다.");
            return;
        }
        post.increaseview();
        postView.printPostDetail(post);

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
                    postView.printPostList(posts);
                }


            } else if (targetNo == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            }
        }
    }

    public void serch() {
        System.out.println("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> posts = postRepository.getPosts();
        ArrayList<Post> searchedPostList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }
        postView.printPostList(searchedPostList);
    }


    public void sort() {
        System.out.println("정렬 대상을 선택해주세요. (1. 번호, 2. 조회수) : ");
        int targetNo = Integer.parseInt(sc.nextLine());

        System.out.println("정렬 방법을 선택해주세요. (1. 오름차순, 2. 내림차순) : ");
        int how = Integer.parseInt(sc.nextLine());

        ArrayList<Post> posts = postRepository.getPosts();

        Comparator<Post> comparator = null;

        if (targetNo == 1) {
            //번호로 정렬
            comparator = Comparator.comparing(Post::getId);
        } else if (targetNo == 2) {
            // 조회수로 정렬
            comparator = Comparator.comparing(Post::getView);
        }

        if (comparator != null) {
            // 정렬 방법에 따라 오름차순/내림차순 선택
            if (how == 2) {
                comparator = comparator.reversed();
            }
            Collections.sort(posts, comparator);

            // 정렬된 목록 출력
            postView.printPostList(posts);
        }
    }

    public void singup() {
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

    public void page() {
        ArrayList<Post> posts = postRepository.getPosts();
        Paging paging = new Paging(posts, 3);   //페이지당 3개의 게시물


        while (true) {
            paging.printCurrentPage();

            System.out.print("페이징 명령어를 입력해주세요 (1. 이전, 2. 다음, 3. 선택, 4. 뒤로가기) : ");
            int command = Integer.parseInt(sc.nextLine());

            if (command == 1) { // 이전 페이지
                paging.prevPage();
            } else if (command == 2) { // 다음 페이지
                paging.nextPage();
            } else if (command == 3) { // 특정 페이지 선택
                System.out.print("이동하실 페이지 번호를 입력해주세요 : ");
                int selectedPage = Integer.parseInt(sc.nextLine());
                paging.moveToPage(selectedPage);
            } else if (command == 4) { // 뒤로가기
                break;
            }
        }
    }


    public String getcurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 원하는 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // 포맷 적용하여 출력하기
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

    // 파일 저장과 로드를 담당하는 메서드
    // 파일 저장 메서드 saveDate
    public void saveDate() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            oos.writeObject(postRepository.getPosts());
            oos.writeObject(memberships);
            oos.writeObject(lastesId);  // 최신 id저장
            System.out.println("데이터가 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDate() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))) {
            postRepository.setPosts((ArrayList<Post>) ois.readObject());
            memberships = (ArrayList<Membership>) ois.readObject();
            lastesId = (int) ois.readObject();  //최신 id 로드

            System.out.println("데이터가 성공적으로 로드되었습니다.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("저장된 데이터가 없습니다.");
        }
    }


}
