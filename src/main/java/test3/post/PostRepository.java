package test3.post;

import java.util.ArrayList;

public class PostRepository {

    ArrayList<Post> posts = new ArrayList<>();


    public void save(Post post) {
        posts.add(post);
    }

    public void delete(Post post) {
        posts.remove(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
