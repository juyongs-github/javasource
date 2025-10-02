package inheritance;

// 관계
// 1. 상속(IS-A) 관계
// 2. 포함(HAS-A) 관계
// 원(Circle)은 점(Point)이다.
// 원(Circle)은 점(Point)을 가지고 있다.

public class Circle extends Shape {
    // int x; // 원점의 x좌표
    // int y; // 원점의 y좌표

    Point point; // 포함 관계 : 한 클래스를 작성하는데 다른 클래스를 맴버변수로 선언
    int r; // 반지름

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.printf("[x = %d, y = %d, color = %s]\n", point.x, point.y, color);
    }
}
