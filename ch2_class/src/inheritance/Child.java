package inheritance;

public class Child extends Parent {
    public Child() {
        // 작성 안해도 미리 선언되어 있음
        // 부모의 생성자 호출
        // super();
        super(15);
    }

    void play() {
        System.out.println("Play!!!");
    }

    @Override
    public void list() {
        super.list(); // 부모 클래스의 list() 메소드 호출
        System.out.println("자식 클래스");
    }
}
