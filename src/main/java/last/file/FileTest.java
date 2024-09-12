package last.file;

public class FileTest {
    public static void main(String[] args) {


        // hello 문자열을 data라는 변수에 저장한다. 이 데이터가 나중에 파일에 쓰여질 내용.
//        String data = "hello world";
//
//        // paths.get() 메서드를 사용해서 "example.txt" 파일의 경로를 나타내는 path객체를 생성.
//        // 이 파일의 경로는 파일이 저장될 위치를 나타내고, 경로는 프로그램이 실행되는 디렉토리 기준.
//        // 파일이 해당 경로에 존재하지 않으면 자동으로 새로 생성된다.
//        Path filePath = Paths.get("example.txt");
//
//
//        // 문자열이기 때문에 getBytes() 메서드를 사용해서 바이트 배열로 변환됨.
//        // files.write() 는 무엇??
//        try {
//            Files.write(filePath, data.getBytes());
//            System.out.println("파일에 데이터가 저장되었습니다."); //파일에 성공적으로 데이터를 썼을 때 출력하도록.
//        } catch (IOException e) {
//            System.out.println("파일 저장 중 오류 발생: " + e.getMessage()); //입출력 예외가 발생하면 오류 메세지 출력
//        }



        // Files.readAllLines() 메서드 사용해서 파일을 읽고, 그 내용을 콘솔에 출력한다.

        Post p1 =new Post(1,"aaa","aaaa","20240912",0);

        // 자바의 대부분의 정보는 객체라는 형태로 구조화(얼려져)되어 있다.
        // 파일은 기본적으로 텍스트로 저장된다.
        // 자바의 객체를 바로 텍스트로 저장 불가능하다.
        // 자바의 객체를 먼저 텍스트(문자)화 시켜야 함 => 직렬화(serializalbe)
        // 텍스트를 불러와서 자바의 객체 형태로 만드는 것 => 역직렬화(Deserialzable)

        // 객체 직렬화 -> jackson 라이브러리를 이용해 객체를 json 문자화하기
        FileUtil fu = new FileUtil();
        JsonUtil ju = new JsonUtil();

        String jsonString = ju.toJsonString(p1);   // p1 객체를 json 문자열로 직렬화

        fu.save(jsonString,"test.json"); // 직렬화된 p1을 test.json 파일에 저장
        String content = fu.load("test.json");

        Post post = ju.toPost(content); // json 문자열을 post로 객체화 (역직렬화)
        System.out.println(post.getTitle());


        Member m1 = new Member();
        m1.setLoginId("hong");
        m1.setLoginPw("1234");
        m1.setNickname("홍길동");

        String memberJson = ju.toJsonString(m1); // Member 직렬화
        fu.save(memberJson, "member.json"); // 문자 => 객체

//        Member m2 = ju.toMember(memberContent);
        System.out.println("m2.getNickname");














//        try {
//            List<String> fileContent = Files.readAllLines(filePath);
//            for (String line : fileContent) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
//        }
    }
}


// 라이브러리 추가 방법 (남이 만든 코드)
// 1. 원하는 라이브러리를 찾아서 다운로드 받는다.
// 2. 얻은 라이브러리 파일을 내 프로젝트에 추가
// 3. 클래스나 메서드에서 import하여 사용