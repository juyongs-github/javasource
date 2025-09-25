package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간까지는 시간당 10030
        // 8시간 이후에는 원래 받던 금액의 1.5배
        // 오늘 근무시간을 입력 받은 후 하루 일당 산출
        // 일당은 정수형
        Scanner sc = new Scanner(System.in);
        System.out.print("일한 시간을 입력 하세요 : ");
        int hour = Integer.parseInt(sc.nextLine());
        sc.close();

        int salary = 0;
        if (hour <= 8) {
            salary = hour * 10030;
        } else {
            salary = 8 * 10030 + (int) ((hour - 8) * 10030 * 1.5);
        }
        System.out.printf("오늘의 일당은 %d원 입니다.", salary);
    }
}
