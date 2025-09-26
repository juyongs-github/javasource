package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        // 은행 프로그램 만들기
        // -----------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // -----------------------------------
        // 선택 >> 1
        // 입금액 >> 1000000
        Scanner sc = new Scanner(System.in);

        int remain = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("입금액 >> ");
                    remain += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액 >> ");
                    remain -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.println("잔고 >> " + remain);
                    break;
                case 4:
                    System.out.printf("프로그램을 종료 합니다..");
                    flag = false;
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다. 다시 입력 해주시기 바랍니다.");
                    break;
            }
        }
    }
}
