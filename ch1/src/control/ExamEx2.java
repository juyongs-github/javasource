package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 3개의 정수를 입력받아 가장 작은 값 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("3개의 정수를 입력 하세요 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        sc.close();

        int min = num1;
        // 풀이 1
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        System.out.printf("가장 작은 값은 %d 입니다.\n", min);

        // 풀이 2
        if (num1 > num2 && num1 > num3) { // num1이 제일 큰 수 일때
            min = num2 < num3 ? num2 : num3;
        } else if (num2 > num1 && num2 > num3) { // num2가 제일 큰 수 일때
            min = num1 < num3 ? num1 : num3;
        } else { // num3이 제일 큰 수 일때
            min = num1 < num2 ? num1 : num2;
        }
        System.out.printf("가장 작은 값은 %d 입니다.\n", min);

        // 풀이 3
        min = Math.min(Math.min(num1, num2), num3);
        System.out.printf("가장 작은 값은 %d 입니다.\n", min);

        // ※ 가장 큰 값 구하기
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.printf("가장 큰 값은 %d 입니다.\n", max);
    }
}
