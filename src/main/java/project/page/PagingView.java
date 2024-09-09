package project.page;

import project.post.Post;

import java.util.ArrayList;

public class PagingView {


    public void printCurrentPage(ArrayList<Post> posts) {
        for (Post post : posts) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.printf("작성자 : %s\n", post.getAuthor());
            System.out.printf("조회수 : %d\n", post.getView());
            System.out.printf("좋아요 : %s %d\n", post.getLikeCount() > 0 ? "♥" : "♡", post.getLikeCount());
            System.out.println("==================");
        }
    }
}
