package object;

// 메소드 오버로딩
// 1. 이름이 같아야 한다
// 2. 매개변수의 개수 또는 타입이 달라야 한다

public class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long add(long a, long b, int c) {
        return a + b + c;
    }

    long add(int a, int b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
