package projectTset;

import project.ProjectApp;

public class Project {

    // main 메서드와 findPostById 메서드가 같이 사용해야 하므로 main 밖으로 빼주고 static을 붙여줬다.
    // static은 공유 목적. 자바에서 기본은 non=static
    // main은 무조건 static을 붙여야 헤서 핵심로직은 main에 작성하지 않는다.
    // 핵심로직을 객체로 빼면 된다.



    public static void main(String[] args) {


        ProjectApp projectApp = new ProjectApp();
        projectApp. start();



    }

}

