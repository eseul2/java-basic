package project;

import project.membership.MembershipController;
import project.post.PostController;

import java.io.Serializable;
import java.util.Scanner;

public class ProjectApp implements Serializable {


    private String loggedInId = null;
    private String loggedInNickname = null;
    Scanner sc = new Scanner(System.in);

    MembershipController membershipController =new MembershipController();
    PostController postController =new PostController(membershipController);



    public void start() {


        while (true) {
            if (loggedInId != null && loggedInNickname != null) {
                System.out.printf("명령어를 입력해주세요[%s(%s)] : ", loggedInId, loggedInNickname);
            } else {
                System.out.print("명령어 : ");
            }
            String command = sc.nextLine();

            if (command.equals("exit")) {
               postController.exit();
            } else if (command.equals("add")) {
                postController.add();
            } else if (command.equals("list")) {
                postController.list();
            } else if (command.equals("update")) {
                postController.update();
            } else if (command.equals("delete")) {
                postController.delete();
            } else if (command.equals("detail")) {
                postController.detail();
            } else if (command.equals("search")) {
                postController.serch();
            } else if (command.equals("signup")) {
                membershipController.singup();
            } else if (command.equals("login")) {
                membershipController.login();
            } else if (command.equals("sort")) {
                postController.sort();
//            }else if(command.equals("page")) {
//                postController.page();
            }
        }
    }











}
// 코드 줄이 너무 길어서 각 기능을 함수화 할것임
// 가독성이 좋아지고 재활용성
// 지역변수(함수에서만 사용하고 버림)
// 외부에 영향을 최소화



//mvc