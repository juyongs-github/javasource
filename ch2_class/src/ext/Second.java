package ext;

import exam.Parent;

public class Second {
    Parent parent = new Parent();

    public void info() {
        // default로 선언된 경우 다른 패키지에서 접근 불가
        // parent.name = "성춘향";
        // parent.grade = "B";
    }
}
