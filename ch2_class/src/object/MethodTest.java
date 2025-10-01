package object;

// 메서드
// 1. 인스턴스(맴버) 메서드 : 클래스 영역 => 인스턴스 생성 후
// 2. 클래스 메서드 : 클래스 영역(static) => 클래스가 메모리에 올라갈 때(공유의 의미)

public class MethodTest {
    // 두 개의 인자(매개변수)를 받아서 덧셈 후 뎃셈 결과 리턴
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // 두 개의 인자(매개변수)를 받아서 뺄셈 후 뺄셈 결과 리턴
    double sub(double num1, double num2) {
        return num1 - num2;
    }

    // 두 개의 인자(float 타입)를 받아서 나눗셈 후 나눗셈 결과 리턴
    float div(float num1, float num2) {
        return num1 / num2;
    }

    // 두 개의 문자열 인자를 받아서 하나의 문자열로 리턴
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    // 한 개의 int 타입의 배열을 받아서 배열을 리턴
    int[] call(int[] arr) {
        return arr;
    }
}
