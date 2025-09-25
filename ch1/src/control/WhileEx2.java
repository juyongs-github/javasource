package control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력받아 각 자리의 합 구하기
        // 345 = 3 + 4 + 5 = 12
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력 하세요 >> ");
        int input = Integer.parseInt(sc.nextLine());
        sc.close();

        int sum = 0;
        while (input != 0) {
            sum += input % 10;
            input /= 10;
        }
        System.out.println("각 자리의 합은 " + sum + " 입니다.");
    }
}
