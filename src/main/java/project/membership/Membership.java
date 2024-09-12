package project.membership;

import java.io.Serializable;

public class Membership implements Serializable {
    private static final long serialVersionUID = 1L;
    private String logInId;
    private String pass;
    private String nickname;



    public Membership(String logInId, String pass, String nickname) {
        this.logInId = logInId;
        this.pass = pass;
        this.nickname = nickname;
    }



    public void setLogInId(String logInId) {
        this.logInId = logInId;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLogInId() {
        return logInId;
    }

    public String getPass() {
        return pass;
    }

    public String getNickname() {
        return nickname;
    }
}