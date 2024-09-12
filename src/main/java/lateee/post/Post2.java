package lateee.post;

public class Post2 {

    private int id;
    private String title;
    private String body;
    private String createDate;
    private int hit;

    public Post2(int id, String title, String body, String createDate,int hit) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createDate = createDate;
        this.hit = hit;
    }

    public void increseHit() {
        this.hit++;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
