package lateee.post;

import java.util.ArrayList;

public class PostRepository {

    ArrayList<Post2> post2s = new ArrayList<>();

    public void save(Post2 post2) {
        post2s.add(post2);
    }

    public void delete(Post2 post2) {
        post2s.remove(post2);
    }

    public ArrayList<Post2> getPost2s() {
        return post2s;
    }

    public Post2 findPostById(int id) {
        for (Post2 post2 : post2s) {
            if (post2.getId() == id) {
                return post2;
            }
        }
        return null;
    }
}
