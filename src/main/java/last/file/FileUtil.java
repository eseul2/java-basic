package last.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {




    // 메서드 오버로딩 => 매개변수 모양만 다르면 동일한 이름의 메서드 여러개 만들기 가능

    public void save(String content, String filename) {

        Path filePath = Paths.get(filename);

        try {
            Files.write(filePath, content.getBytes());
            System.out.println("파일 작성 완료:" + filePath.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
        }
    }


    public String load(String filename) {

        Path filePath = Paths.get(filename);

        try {
            // 파일에서 문자열 읽기
             String content = Files.readString(filePath);
               return content;
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
        return null;
    }


}