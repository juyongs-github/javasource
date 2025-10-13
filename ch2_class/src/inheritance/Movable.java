package inheritance;

// 맴버변수에 final을 붙이면 상수 => 초기화

public interface Movable {
    // 상수 선언만 가능
    // final 키워드가 없어도 상수로 인식
    int pos = 0;

    // abstract 키워드가 없어도 추상 메서드로 인식
    void move(int x, int y);

    // ★ 추가된 개념
    // static, default 키워드가 있어야 일반 메소드 선언 가능
    static void print() {

    }

    default void print2() {

    }
}
