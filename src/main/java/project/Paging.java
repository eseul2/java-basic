package project;

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

    // 현재 페이지의 게시물 출력
    public void printCurrentPage() {
        int start = (currentPage - 1) * itemsPerPage;
        int end = Math.min(start + itemsPerPage, posts.size());

        System.out.println("===============");
        for (int i = start; i < end; i++) {
            Post post = posts.get(i);
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.printf("작성자 : %s\n", post.getAuthor());
            System.out.printf("조회수 : %d\n", post.getView());
            System.out.printf("좋아요 : %s %d\n", post.getLikeCount() > 0 ? "♥" : "♡", post.getLikeCount());
            System.out.println("==================");
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


    // 페이징 블록을 출력 (5페이지씩)
    private void printPageBlock() {
        int currentBlock = (currentPage - 1) / 5 * 5 + 1;
        int endBlock = Math.min(currentBlock + 4, totalPages);

        for (int i = currentBlock; i <= endBlock; i++) {
            if (i == currentPage) {
                System.out.printf("[%d] ", i);
            } else {
                System.out.printf("%d ", i);
            }
        }
        if (endBlock < totalPages) {
            System.out.print(">>");
        }
        System.out.println();
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

