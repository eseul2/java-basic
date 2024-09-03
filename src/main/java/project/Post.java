package project;

import java.time.LocalDateTime;

public class Post {


    private int id;
    private String title;
    private String content;
    private LocalDateTime dateTime;

    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateTime = dateTime;
    }



    public int getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public String getContent() {
        return content;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



