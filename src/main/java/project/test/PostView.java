package project.test;

import java.util.ArrayList;

public class PostView {


    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("=================");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("=================");
        }
    }

    public void printPostDetail(Post post, ArrayList<Reply> replies) {
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("조회수 : %d\n", post.getHit());
        System.out.println("=============");
        printReplies(replies);
    }

    public void printReplies(ArrayList<Reply> replies) {
        System.out.println("====== 댓글 ======");
        for(Reply reply : replies) {
            System.out.printf("댓글 내용 : %s\n",reply.getRbody());
            System.out.printf("댓글 작성일 : %s\n",reply.getRegDate());
            System.out.println("===============");
        }

    }
}
