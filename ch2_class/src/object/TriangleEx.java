package object;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();

        // 속성(맴버변수) 초기화
        // 1. 직접 접근(속성)
        triangle1.baseLine = 10;
        triangle1.height = 6;

        // 2. 생성자 사용하여 접근
        Triangle triangle2 = new Triangle(20, 5);

        // 3. setter 메소드
        Triangle triangle3 = new Triangle();
        triangle3.setBaseLine(15);
        triangle3.setHeight(7);

        // 삼각형 너비 구하기
        System.out.println(triangle1.getArea());
        System.out.println(triangle2.getArea());
        System.out.println(triangle3.getArea());
    }
}
