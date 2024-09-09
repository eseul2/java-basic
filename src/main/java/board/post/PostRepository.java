package board.post;

import java.util.ArrayList;

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


    // 창고에서 특정 물건을 제거
    public void delete(Post post) {
        posts.remove(post);
    }

    // keyword가 포함된 Post만 선별해서 ArrayList로 담아 필요한 누군가에게 제공
    public ArrayList<Post> getPostsByKeyword(String keyword) {
        ArrayList<Post> searchedPostList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }

        return searchedPostList;
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
