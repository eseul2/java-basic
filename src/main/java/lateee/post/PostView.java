package lateee.post;

import java.util.ArrayList;

public class PostView {


    public void printPostList(ArrayList<Post2> postList) {
        System.out.println("==============");
        for (Post2 post2 : postList) {
            System.out.printf("번호 : %d\n", post2.getId());
            System.out.printf("제목 : %s\n", post2.getTitle());
            System.out.println("==============");
        }
    }

    public void postListDetail(Post2 post2,Reply reply) {
        System.out.printf("번호 : %d\n", post2.getId());
        System.out.printf("제목 : %s\n", post2.getTitle());
        System.out.printf("내용 : %s\n", post2.getBody());
        System.out.printf("등록날짜 : %s\n", post2.getCreateDate());
        System.out.printf("조회수 : %d\n", post2.getHit());
        System.out.println("==============");
        printRepliesList(reply);
    }

    public void printRepliesList(Reply reply) {
        System.out.println("==== 댓글 ====");
        System.out.printf("댓글 내용 : %s\n",reply.getBody());
        System.out.printf("댓글 작성일 : %s\n",reply.getRegDate());
    }


    }

