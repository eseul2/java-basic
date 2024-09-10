package project.test;

public class Reply {

    private int id;
    private int postId;
    private String rbody;
    private String regDate;


    public Reply(int id, int postId, String body, String regDate) {
        this.id = id;
        this.postId = postId;
        this.rbody = rbody;
        this.regDate =regDate;
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

    public String getRbody() {
        return rbody;
    }

    public void setRbody(String rbody) {
        this.rbody = rbody;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
