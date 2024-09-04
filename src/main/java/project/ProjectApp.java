package project;

import javax.swing.plaf.IconUIResource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectApp {

    ArrayList<Post> posts = new ArrayList<>();


    public void run() {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        int lastestId = 1; // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획 // 3개의 텍스트를 이미 넣었기 때문에 카운트는 4번부터!
        LocalDateTime now = LocalDateTime.now();


        // 8 . 텍스트 기능 넣기
        posts.add(new Post(lastestId++, "안녕하세요 반갑습니다. java 공부중이에요.", "자바 너무 재밌어요!!", now, ""));
        posts.add(new Post(lastestId++, "java 질문좀 할게요~", "", now, ""));
        posts.add(new Post(lastestId++, "정처기 따야되나요?", "", now,""));


        while (true) {

            System.out.print("명령어 입력 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                // 게시물 등록 날짜와 시간 설정
                now = LocalDateTime.now();
                Post post = new Post(lastestId, title, content, now, command);
//                post.setTitle(title);
//                post.setContent(content);
                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                System.out.println("등록날짜 : " + now.format(formatter));
                lastestId++;     //다음 게시물의 id를 부여하기 위해 1증가
            } else if (command.equals("list")) {
//                System.out.println("===============");
//                for(int i =0; i < posts.size(); i++){
//                    System.out.printf("제목 : %s\n",posts.get(i).getTitle());
//                    System.out.printf("내용 : %s\n",posts.get(i).getContent());
//                    System.out.println("==============");
//                }
                // posts에 저장된 배열의 수만큼 출력한다. 저장할 값을 오른쪽에 ??
                for (Post post : posts) {
                    System.out.printf("번호 : %s\n", post.getId());
                    System.out.printf("제목 : %s\n", post.getTitle());
                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                // 논리 연산자
                // 조건 1 || 조건 2  -> 조건1,조건3 둘 중 하나만 만족해도 실행
                // 조건 1 && 조건 2  -> 조건1,조건2가 동시에 만족(모두 만족)해야만 실행
//                if(targetId < 1 || targetId > posts.size()){
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
                // 전체탐색
                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.print("수정할 제목 : ");
                        String newTitle = sc.nextLine();

                        System.out.print("수정할 내용 : ");
                        String newContent = sc.nextLine();

                        post.setTitle(newTitle);
                        post.setContent(newContent);
                        System.out.println("수정이 완료되었습니다.");
                        break;
                    }
                }
//                Post newPost = new Post(newTitle,newContent);
//                posts.set(targetId = -1, newPost);   // 원하는 위치의 post를 newPost로 교체
//                Post post = posts.get(targetId -1);
            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
//                for (Post post : posts) {
//                    if (post.getId() == targetId) {
//                        posts.remove(post);    // index가 아닌 값을 넣어서 해당 값을 삭제할 수도 있다. 객체를 넣으면 해당 객체를 삭제해준다
//                        System.out.println("삭제가 완료되었습니다.");
//                        break;
//                    }
//                }
                // 새로운 버전
                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("없는 게시물입니다.");
                    continue;
                }
                posts.remove(post);
                System.out.println("삭제가 완료되었습니다.");


            } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        post.increaseViews();
                        System.out.println("====" + post.getId() + "번 게시물" + "====");
                        System.out.println("번호 : " + post.getId());
                        System.out.println("제목 : " + post.getTitle());
                        System.out.println("내용 : " + post.getContent());
                        System.out.println("등록날짜 : " + post.getDateTime().format(formatter));
                        System.out.println("조회수 : " + post.getViews());
                        System.out.println("=================");

                        System.out.println("====== 댓글 ======");
                        for(String comment : post.getComments()) {
                            System.out.println(comment);
                        }


                        while(true) {
                            System.out.print("상세보기 기능을 선택해주세요. 1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로 :");
                            int targetNO = Integer.parseInt(sc.nextLine());
                            if(targetNO == 1){
                                System.out.println("===== 댓글 =====");
                                System.out.print("댓글 내용 : ");
                                String comment = sc.nextLine();
                                post.addcomment(comment);
                                System.out.println("댓글이 성공적으로 등록되었습니다.");


                            }
                            else if(targetNO == 2){
                                System.out.println("[ 추천 기능 ]");
                            }
                            else if(targetNO == 3) {
                                System.out.println("수정");
                            }
                            else if(targetNO == 4) {
                                System.out.println("삭제");
                            }
                            else if(targetNO == 5){
                                System.out.println("상세보기 화면을 빠져나갑니다.");
                                break;
                            }

                        }





                    }
                }
            } else if (command.equals("search")) {
                System.out.println("검색 키워드를 입력 해주세요 : ");
                String keyword = sc.nextLine();

                // 서치랑 리스트가 중복이니까 해결
                System.out.println("==================");
                for (Post post : posts) {
                    if (post.getTitle().contains(keyword)) {
                        System.out.println("번호 : " + post.getId());
                        System.out.println("제목 : " + post.getTitle());
                        System.out.println("==================");
                    }
                }
            }
//                boolean found = false;    // 검색 결과가 있는지 확인하기 위한 변수??????? f
//                for (Post post : posts) {     //왼쪽의 값이 오른쪽에 있다 !!
//                    if (post.getTitle().contains(keyword)) {
//                        System.out.println("번호 : " + post.getId());
//                        System.out.println("제목 : " + post.getTitle());
//                        found = true;   // 찾으면 출력을 하라는 얘기??
//                    }
//                }
//                if (!found) {
//                    System.out.println("검색결과가 없습니다.");
//                }










        }
    }


    // 수정, 삭제 행동은 모두 다르기 때문에  이렇게만
    // 포스트 아이디로 찾겠다.
    public Post findPostById(int id) {

        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;   // return 만나면 메서드는 그 즉시 종료
            }
        }
        return null;   // null은 없다라는 의미
    }

    // 현재 날짜 메서드
//    public String getCurrentDateTime(){

//    }


    //   list, detail 이 중복됨 여기다가 새로 만들어서 사용하기

//    public void printPostList(ArrayList<Post> targetList){
//
//    }


}

