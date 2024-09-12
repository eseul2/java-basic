package test3;

public class Reply {

    private int id;
    private int postId;
    private String regDate;
    private String body;


    public Reply(int id, int postId, String regDate, String body) {
        this.id = id;
        this.postId = postId;
        this.regDate = regDate;
        this.body = body;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
