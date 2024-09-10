package project.page;

import project.post.Post;

import java.util.ArrayList;

public class PagingView {


    public void printCurrentPage(ArrayList<Post> posts, int currentPage, int itemsPerPage, int totalPages) {
        int start = (currentPage - 1) * itemsPerPage;
        int end = Math.min(start + itemsPerPage, posts.size());
        System.out.println("==================");
        for(int i = start; i < end; i++) {
            Post post = posts.get(i);
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("작성자 : %s\n", post.getAuthor());
        System.out.printf("조회수 : %d\n", post.getView());
        System.out.printf("좋아요 : %s %d\n", post.getLikeCount() > 0 ? "♥" : "♡", post.getLikeCount());
        System.out.println("==================");
    }
        printPageBlock(currentPage, totalPages);
}

// 페이징 블록을 출력 (5페이지씩)
private void printPageBlock(int currentPage, int totalPages) {
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

//// 현재 페이지의 게시물 출력
//public void printCurrentPage() {
//    int start = (currentPage - 1) * itemsPerPage;
//    int end = Math.min(start + itemsPerPage, posts.size());
//    System.out.println("===============");
//    for (int i = start; i < end; i++) {
//        Post post = posts.get(i);
//
//    }
//    printPageBlock();
//}


}
