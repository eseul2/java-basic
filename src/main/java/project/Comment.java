package project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Comment {

    private  String content;
    private LocalDateTime dateTime;


    public Comment(String content, LocalDateTime dateTime){
        this.content =content;
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public String getFormatterdDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                return dateTime.format((formatter));
    }
}
