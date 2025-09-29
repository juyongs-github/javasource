package object;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        // 메소드 호출
        // 1) 변수에 받기
        // 2) 출력문
        long result = myMath.add(12, 63);
        System.out.println("덧셈 결과 : " + result);

        result = myMath.subtract(85, 35);
        System.out.println("뺄셈 결과 : " + result);

        result = myMath.multiply(5, 25);
        System.out.println("곱셈 결과 : " + result);

        double result2 = myMath.divide(10, 5);
        System.out.println("나눗셈 결과 : " + result2);
    }
}
