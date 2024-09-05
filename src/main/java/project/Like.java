package project;

public class Like {

    private String userId;
    public int postId;




    public Like(String userId, int postId) {
        this.userId = userId;
        this.postId = postId;
    }


    public String getUserId() {
        return userId;
    }

    public int getPostId() {
        return postId;
    }

}

