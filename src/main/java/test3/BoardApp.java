package test3;

import test3.post.PostController;

import java.util.Scanner;

public class BoardApp {

    Scanner sc = new Scanner(System.in);
    PostController postController = new PostController();

    public void start() {


        while (true) {
            System.out.print("명령어를 입력하세요 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
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
                postController.search();
            }else if(command.equals("signup")) {
                postController.signup();
            }
        }
    }


}

