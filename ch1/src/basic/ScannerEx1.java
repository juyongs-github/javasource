package basic;

import java.util.Scanner;

// System.in : 키보드
// System.out : 화면

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int input = sc.nextInt();
        System.out.printf("입력 값 : %d", input);
        sc.close();
    }
}
