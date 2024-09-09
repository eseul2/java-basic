package project.post;

import java.io.Serializable;
import java.util.ArrayList;

public class PostView implements Serializable {


    // 서치 기능
    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==================");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.printf("작성자 : %s\n", post.getAuthor());
            System.out.println("==================");

        }
    }

    public void printPostDetail(Post post) {
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("작성자 : %s\n", post.getAuthor());
        System.out.printf("조회수 : %d\n", post.getView());
        System.out.printf("좋아요 : %s %d\n", post.getLikeCount() > 0 ? "♥" : "♡", post.getLikeCount());
        System.out.println("==================");
    }


}
