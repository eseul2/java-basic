package project;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Post {

    private int id;
    private String title;
    private String body;
    private String author;   // 작성자 변수 추가
    private String createDate;
    private int view;

    private ArrayList<Comment> comments;
    private ArrayList<String> likes;         // 좋아요를 누른 사용자 id 목록

    public Post(int id, String title, String body, String author, String createDate, int view) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
        this.createDate = createDate;
        this.view = view;
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
    }


    // 좋아요 추가
    public void addLike(String userId) {
        if (!likes.contains(userId)) {
            likes.add(userId);
        }
    }

    // 좋아요 제거
    public void removeLike(String userId) {
        likes.remove(userId);
    }


    // 좋아요 수 반환
    public int getLikeCount() {
        return likes.size();
    }

    // 좋아요 목록 반환
    public ArrayList<String> getLikes() {
        return  likes;
    }

    public String getAuthor() {
        return author;
    }


    public void addComment(String textComment) {
        String dateTime = getCurrentDateTime();
        comments.add(new Comment(textComment, dateTime));
    }

    public void increaseview() {
        this.view++;
    }


    public ArrayList<Comment> getComments() {
        return comments;
    }

    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public Post(int id, String title, String body, String createDate) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createDate = createDate;
    }


    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getView() {
        return view;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    //    public Post(int id, String title, String body) {
//        this.id = id;
//        this.title = title;
//        this.body = body;
//    }


}


