package project;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();
        int lastestId = 1; // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임.

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");




        while (true) {
            System.out.print("명령어를 입력해주세요 : ");
            String command = (sc.nextLine());

            if (command.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요 : ");
                String title = (sc.nextLine());

                System.out.println("게시물 내용을 입력해주세요 : ");
                String content = (sc.nextLine());

                 LocalDateTime now = LocalDateTime.now();
                Post post = new Post(lastestId, content, title,now);
                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                System.out.println("등록날짜 : " + now.format(formatter));
                lastestId++;
            }


            //  3번 게시물 조회
            else if (command.equals("list")) {
                System.out.println("=================");
                for (Post post : posts) {
                    System.out.println("번호 : " + post.getId());
                    System.out.println("제목 : " + post.getTitle());
                    System.out.println("=================");
                }
            }


            // 4번 게시물 수정
            else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

//                if (targetId < 0 || targetId >= posts.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }

                for (Post post : posts) {
                    if (post.getId() == targetId) {

                        System.out.println(" 수정할 제목 : ");
                        String newTitle = sc.nextLine();

                        System.out.println("수정할 내용 : ");
                        String newContent = sc.nextLine();

                        post.setTitle(newTitle);
                        post.setContent(newContent);

//                Post post = posts.get(targetId = 1);
//                post.setTitle(newTitle);
//                post.setContent(newContent);
//
                        System.out.println("수정이 완료 되었습니다. ");
                        break;
                    }
                }
            }


            // 5번 게시물 삭제
            else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());   // 삭제 : elision

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        posts.remove(post);
                        System.out.println("삭제가 완료되었습니다.");
                        break;
                       }

                    else{
                        System.out.println("잘못된 번호입니다.");
                    }

                    }
                }


                    // 기능6 상세보기 화면 만들기
            else if(command.equals("detail")){
                System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.println("번호 : " + post.getId());
                        System.out.println("제목 : " + post.getTitle());
                        System.out.println("내용 : " + post.getContent());
                        System.out.println("등록날짜 : " + post.getDateTime().format(formatter));
                        System.out.println("=================");   

                    }
                }
            }

                


        }
    }
}














