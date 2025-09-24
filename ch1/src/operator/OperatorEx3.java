package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        // 비교 연산자: > < >= <= == !=
        // true, false 결과값
        // == : 같다
        // != : 같지 않다

        int a = 10;
        float f = 10.0f;
        // 연산 수행 전 피연산자의 타입을 맞춘 후 비교
        System.out.println(a == f); // true
        System.out.println(a != f); // false
        System.out.println('A' == 65); // true
    }
}
