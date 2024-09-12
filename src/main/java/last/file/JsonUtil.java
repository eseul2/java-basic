package last.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonUtil {

    public String toJsonString(Post post) {

        // Jackson의 objectMapper 객체 생성
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // 객체를 JSON 문자열로 직렬화
            String jsonString = objectMapper.writeValueAsString(post);
            return jsonString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


 //    역직렬화
    public Post toPost(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Post post = objectMapper.readValue(jsonString, Post.class);
            return post;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public String toJsonString(Member member) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // 객체를 JSON 문자열로 직렬화
            String jsonString = objectMapper.writeValueAsString(member);
            return jsonString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Member toMember(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Member member = objectMapper.readValue(jsonString, Member.class);
            return member;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }





}
