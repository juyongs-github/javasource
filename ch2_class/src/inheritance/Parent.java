package inheritance;

// 상속

// 기존의 클래스 재사용 개념
// 부모(조상, 상위, super) 클래스
// 자식(자손, 하위, 파생) 클래스

public class Parent {
    int age;

    public Parent() {
    }

    public Parent(int age) {
        this.age = age;
    }

    public void list() {
        System.out.println("부모 클래스");
    }
}
