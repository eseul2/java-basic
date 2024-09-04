package project;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {


    private int id;
    private String title;
    private String content;
    private LocalDateTime dateTime;
    private int views;
    private ArrayList<String> comments;



    public Post(int id, String title, String content, LocalDateTime dateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateTime = dateTime;
        this.views = views;
        this.comments = new ArrayList<>();



    }


    // 조회수 증가시킬 수 있도록 변수 이름 직관적이게
    public void increaseViews() {
        this.views++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public ArrayList<String> getComments(){
        return comments;
    }


    public void addcomment(String comment) {
        comments.add(comment);
    }

    public int getViews() {
        return views;



    }
}

