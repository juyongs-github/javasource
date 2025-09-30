package object;

public class CarEx {
    public static void main(String[] args) {
        int x = 10;

        // Car 인스턴스 생성
        Car car = new Car();

        // 맴버변수 초기화
        // 1. 직접 접근
        car.companyName = "현대";
        car.model = "아반떼";
        car.color = "white";
        car.maxSpeed = 200;
        System.out.println(car);

        // 2. setter 메소드
        // 3. 생성자
        Car car2 = new Car("기아");
        System.out.println(car2);

        Car car3 = new Car("현대", "소나타");
        Car car4 = new Car("현대", "아이오닉5", "gray");
        Car car5 = new Car("현대", "포터", "white", 150);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car3.setColor("green");
        System.out.println(car3);
    }

    public static void println(Car car) {
        System.out.println("-------------------------------------");
        System.out.println("제조회사 : " + car.getCompanyName());
        System.out.println("모델명 : " + car.getModel());
        System.out.println("색상 : " + car.getColor());
        System.out.println("최고속도 : " + car.getMaxSpeed());
        System.out.println("-------------------------------------");
    }

    public static void test(String str) {

    }
}
