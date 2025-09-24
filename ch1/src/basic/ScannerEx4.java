package basic;

import java.util.Scanner;

// System.in : 키보드
// System.out : 화면

public class ScannerEx4 {
    public static void main(String[] args) {
        // ScannerEx3 개선
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");

        // String num1 = sc.nextLine();
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parseFloat(sc.nextLine());
        // double input1 = Double.parseDouble(sc.nextLine());

        System.out.print("연산자 입력 : ");
        String op = sc.nextLine();

        System.out.print("두번째 숫자 입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();
    }
}
