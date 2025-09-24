package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        // 입력받은 숫자가 양수, 음수인지 출력하기
        String s = num > 0 ? "양수" : (num == 0 ? "0" : "음수");
        System.out.printf("입력받은 숫자는 %s 입니다.", s);
    }
}
