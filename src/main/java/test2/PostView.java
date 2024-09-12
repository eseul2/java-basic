package test2;

import java.util.ArrayList;

public class PostView {


    public void printPostDetail(Post post) {
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("조회수 : %d\n", post.getHit());
        System.out.println("=================");
    }


    public void printPostList(ArrayList<Post> postList) {
        System.out.println("==============");
        for (Post post : postList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("==============");
        }
    }
}
