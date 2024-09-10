package project.membership;

import java.util.ArrayList;
import java.util.Scanner;

public class MembershipController {

    private MembershipRepository membershipRepository = new MembershipRepository();

    private String loggedInId = null;
    private String loggedInNickname = null;
    private Scanner sc = new Scanner(System.in);


    public void singup() {
        System.out.println("==== 회원가입을 진행합니다. ====");
        System.out.print("아이디를 입력해주세요 : ");
        String logInid = sc.nextLine();   // 고객아이디 변수명 기억@!!!!

        System.out.print("비밀번호를 입력해주세요 : ");
        String pass = sc.nextLine();   // 고객 비밀번호

        System.out.println("닉네임을 입력해주세요 : ");
        String nickname = sc.nextLine();    // 고객 닉네임

        Membership membership = new Membership(logInid, pass, nickname);
        membershipRepository.save(membership);
        System.out.println("회원가입이 완료되었습니다.");
    }

    public void login() {
        System.out.print("아이디 : ");
        String logInId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pass = sc.nextLine();

        for (Membership membership : membershipRepository.getMemberships()) {
            if (membership.getLogInId().equals(logInId) && membership.getPass().equals(pass)) {
                loggedInId = membership.getLogInId();   // 로그인한 유저 id 저장
                loggedInNickname = membership.getNickname();
                System.out.printf("%s님 환영합니다!\n", membership.getNickname());
                return;
            }
            System.out.println("로그인 실패 ");
        }
    }


    public String getLoggedInId() {
        return loggedInId;
    }

    public String getLoggedInNickname() {
        return loggedInNickname;
    }
}
