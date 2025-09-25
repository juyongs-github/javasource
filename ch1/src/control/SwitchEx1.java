package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        // 현재 월 입력받기
        // 월이 3, 4, 5월 => 봄
        // 월이 6, 7, 8월 => 여름
        // 월이 9, 10, 11월 => 가을
        // 월이 12, 1, 2월 => 겨울
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 월을 입력 하세요 : ");
        int month = Integer.parseInt(sc.nextLine());
        sc.close();

        if (month >= 3 && month <= 5) {
            System.out.println("현재 계절은 봄 입니다.");
        } else if (month >= 6 && month <= 8) {
            System.out.println("현재 계절은 여름 입니다.");
        } else if (month >= 9 && month <= 11) {
            System.out.println("현재 계절은 가을 입니다.");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("현재 계절은 겨울 입니다.");
        } else {
            System.out.println("월을 확인 해주세요.");
        }

        // switch로 변경
        // 조건식을 계산한다. => 조건식과 일치하는 case 문으로 이동 => 문장 수행 => break나 switch 구문의 끝을 만나면
        // switch문 빠져나감
        // 조건식 결과는 정수, 문자열만 가능
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄 입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름 입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재 계절은 가을 입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 겨울 입니다.");
                break;
            default:
                System.out.println("월을 확인 해주세요.");
                break;
        }
    }
}
