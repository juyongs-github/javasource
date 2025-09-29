package object;

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
