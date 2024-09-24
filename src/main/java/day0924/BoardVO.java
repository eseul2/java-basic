package day0924;

public class BoardVO {  //Board(게시판) VO(value Object) 같은 의미로 DTO (data transer Object)

//게시판에서 사용하는 값을 담기 위해서 사용하는 클래스를 VO라고 한다.


    private String subject;  // 게시판 제목을 담는 멤버변수 (멤버변수는 초기화 하지 않아도 자동 초기화 된다.)
    private String content;  // 게시판의 내용을 담는 변수


    private int bidx;  // 게시판 자동생성 고유번호


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getContent() {
        return content;
    }


    public void setContents(String content) {
        this.content = content;
    }


    public int getBidx() {
        return bidx;
    }


    public void setBidx(int bidx) {
        this.bidx = bidx;
    }



}
