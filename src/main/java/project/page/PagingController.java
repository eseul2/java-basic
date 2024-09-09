package project.page;

import project.post.Post;

import java.util.ArrayList;

public class PagingController {

    private ArrayList<Post> posts;
    private int itemsPerPage;   //페이지 항목
    private int currentPage; //현재 페이지
    private int totalPages; //전체 페이지



    public PagingController(ArrayList<Post> posts, int itemsPerPage) {
        this.posts = posts;
        this.itemsPerPage = itemsPerPage;
        this.currentPage = 1;
        this.totalPages = (int) Math.ceil((double) posts.size() / itemsPerPage);

    }

    public void page() {
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


    // 현재 페이지의 게시물 출력
    public void printCurrentPage() {
        int start = (currentPage - 1) * itemsPerPage;
        int end = Math.min(start + itemsPerPage, posts.size());
        System.out.println("===============");
        for (int i = start; i < end; i++) {
            Post post = posts.get(i);

        }
        printPageBlock();
    }
    // 이전 페이지로 이동
    public void prevPage() {
        if (currentPage > 1) {
            currentPage--;
        } else {
            System.out.println("첫 페이지입니다.");
        }
    }


    // 다음 페이지로 이동
    public void nextPage() {
        if (currentPage < totalPages) {
            currentPage++;
        } else {
            System.out.println("마지막 페이지입니다.");
        }
    }


    // 특정 페이지로 이동
    public void moveToPage(int page) {
        if (page >= 1 && page <= totalPages) {
            currentPage = page;
        } else {
            System.out.println("잘못된 페이지 번호입니다.");
        }
    }


}
