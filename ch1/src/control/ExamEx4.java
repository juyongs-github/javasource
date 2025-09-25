package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산(+, -, *, /) 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("사칙연산 할 2개의 숫자와 연산자를 입력 하세요 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        String op = sc.nextLine();
        sc.close();

        switch (op) {
            case "+":
                System.out.println("연산 결과는 " + (num1 + num2) + " 입니다.");
                break;
            case "-":
                System.out.println("연산 결과는 " + (num1 - num2) + " 입니다.");
                break;
            case "*":
                System.out.println("연산 결과는 " + (num1 * num2) + " 입니다.");
                break;
            case "/":
                System.out.println("연산 결과는 " + (num1 / num2) + " 입니다.");
                break;
            default:
                System.out.println("연산 기호가 잘못 되었습니다.");
                break;
        }
    }
}
