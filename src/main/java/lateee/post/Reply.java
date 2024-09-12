package lateee.post;

public class Reply {

    private int id;  //댓글!!!
    private int post2Id;
    private String body;
    private String regDate;


    public Reply(int id, int post2Id, String body, String regDate) {
        this.id = id;
        this.post2Id = post2Id;
        this.body = body;
        this.regDate = regDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPost2Id() {
        return post2Id;
    }

    public void setPost2Id(int post2Id) {
        this.post2Id = post2Id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
