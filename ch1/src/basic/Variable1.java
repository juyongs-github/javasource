package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;
        int sum = num + 20;
        System.out.println("num 변수 값 : " + num);
        System.out.println("sum 변수 값 : " + sum);
        System.out.printf("num 변수 값 : %d\n", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age = " + age + ", maxSpeed = " + maxSpeed);
        System.out.printf("age = %d, maxSpeed = %d\n", age, maxSpeed);
        System.out.printf("age = %10d, maxSpeed = %5d\n", age, maxSpeed);

        // 기존 변수에 새로운 값을 담고 싶다면 타입은 쓰지 않는다(기존 값은 사라짐)
        num = 35;

        // 상수 선언 후 값 할당
        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
    }
}
