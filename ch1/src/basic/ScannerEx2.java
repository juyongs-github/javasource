package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // println() : 출력 후 줄바꿈
        // printf() : 포맷 지정(줄바꿈 없음)
        // print() : 출력(줄바꿈 없음)
        System.out.print("두자리 정수 입력 : ");
        // int num = sc.nextInt();
        String num = sc.nextLine();
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1));

        int input = Integer.parseInt(num); // 문자를 숫자로 변환
        System.out.println("input = " + input);
        System.out.println("input = " + (input + 1));
    }
}
