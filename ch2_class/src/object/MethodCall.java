package object;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        // static 변수 호출
        System.out.println(cv);
        // 인스턴스 변수 호출
        // static 메소드 안에서는 호출 안됨! (생성 시점이 다르기 때문)
        // System.out.println(iv);
        System.out.println(obj.iv); // 인스턴스 변수를 호출 하려면 인스턴스 생성 후 값 호출하기
    }

    static void staticMethod2() {
        MethodCall obj = new MethodCall();
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        // static 메소드 안에서는 호출 안됨! (생성 시점이 다르기 때문)
        // instanceMethod1();
        obj.instanceMethod1(); // 인스턴스 메소드를 호출 하려면 인스턴스 생성 후 메소드 호출하기
    }

    void instanceMethod1() {
        // static 변수 호출
        System.out.println(cv);
        // 인스턴스 변수 호출
        System.out.println(iv);
    }

    void instanceMethod2() {
        // static 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        instanceMethod1();
    }
}
