package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // while 변형 구조
        // do {
        // // 조건이 거짓이여도 한번은 실행
        // } while (조건식);

        // int i = 10;
        // do {
        // System.out.println(i);
        // } while (i < 10);

        // 1 ~ 100 사이의 정수를 입력 받기
        // 컴퓨터도 1 ~ 100 사이의 임의의 수 지정
        // 컴퓨터가 생성한 수를 맞추기
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int com = (int) (Math.random() * 100) + 1;
        do {
            // 사용자 입력
            System.out.print("1 ~ 100 사이의 정수를 입력 >> ");
            num = Integer.parseInt(sc.nextLine());

            // 사용자 입력과 컴퓨터가 생성한 임의의 수 비교
            // 더 작은 수 or 더 큰 수로 다시 시도해 보세요
            if (num > com) {
                System.out.println("더 작은 수로 다시 시도해 보세요");
            } else {
                System.out.println("더 큰 수로 다시 시도해 보세요");
            }
        } while (num != com);
        System.out.println("정답 입니다!");
        sc.close();
    }
}
