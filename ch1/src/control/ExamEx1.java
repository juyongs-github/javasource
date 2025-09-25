package control;

import java.util.Scanner;

public class ExamEx1 {
    public static void main(String[] args) {
        // 년도를 입력받아 윤년인지, 평년인지 출력
        // 윤년 : 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아니거나, 년도를 400으로 나눈 나머지가 0인 년도
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력 하세요 >> ");
        int year = Integer.parseInt(sc.nextLine());
        sc.close();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("입력한 년도는 윤년 입니다.");
        } else {
            System.out.println("입력한 년도는 평년 입니다.");
        }
    }
}
