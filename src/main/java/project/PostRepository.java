package project;


import java.util.ArrayList;

// 창고 관리 ( Model)
public class PostRepository {

    private ArrayList<Post> posts = new ArrayList<>();



    // 누군가에게 Post를 넘겨받아서 창고(ArrayList)에 저장 해주는 기능
    public void save(Post post) {
        posts.add(post);
    }

    // 자신이 가지고 있는 창고의(ArrayList) 내용물을 다른 누군가에게 전달
    public ArrayList<Post> getPosts() {
        return posts;
    }


    // 제거 하고 싶은 값을 넣어라
    public void delete(Post post) {
        posts.remove(post);
    }
}
