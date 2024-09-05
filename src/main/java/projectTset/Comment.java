package projectTset;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Comment {



    // 댓글
    private String textComment;
    private String dateTime;

    public Comment(String textComment, String dateTime) {
        this.textComment = textComment;
        this.dateTime = dateTime;
    }

    public String getText() {
        return textComment;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", dateTime, textComment);
    }
}






