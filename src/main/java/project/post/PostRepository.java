package project.post;


import java.io.Serializable;
import java.util.ArrayList;

// 창고 관리 ( Model)
public class PostRepository implements Serializable {

    private ArrayList<Post> posts = new ArrayList<>();


    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    // 누군가에게 Post를 넘겨받아서 창고(ArrayList)에 저장 해주는 기능
    public void save(Post post) {
        posts.add(post);
    }

    // 자신이 가지고 있는 창고의(ArrayList) 내용물을 다른 누군가에게 전달
    public ArrayList<Post> getPosts() {
        return posts;
    }


    // 제거 하고 싶은 값을 넣어라
    // 창고에서 특정 물건을 제거함
    public void delete(Post post) {
        posts.remove(post);
    }


    // 찾겠다. 포스트를. 아이디로
// 만약 내가 찾고자 하는 게시물이 없다면?
    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {         //항상 찾는 값이 바뀔테니까 매개변수 값을 입력해준다.
                return post;                 // return을 만나면 메서드는 그 즉시 종료
            }
        }
        return null;
    }


    }



