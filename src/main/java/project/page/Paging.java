package project.page;

import project.post.Post;

import java.util.ArrayList;

public class Paging {

    private ArrayList<Post> posts;
    // 페이지 항목
    private int itemsPerPage;
    // 현재 페이지
    private int currentPage;
    // 전체 페이지
    private int totalPages;




    public Paging(ArrayList<Post> posts, int itemsPerPage) {
        this.posts = posts;
        this.itemsPerPage = itemsPerPage;
        this.currentPage = 1;
        this.totalPages = (int) Math.ceil((double) posts.size() / itemsPerPage);
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



    // 현재 페이지 반환
    public int getCurrentPage() {
        return currentPage;
    }


    // 전체 페이지 수 반환
    public int getTotalPages() {
        return totalPages;
    }
}

