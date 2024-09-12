package lateee;

import lateee.post.PostController;

import java.util.Scanner;

public class BoardApp2 {

    PostController postController = new PostController();

    public void start() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("명령어를 입력해주세요 : ");
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
            }
        }


    }
}
