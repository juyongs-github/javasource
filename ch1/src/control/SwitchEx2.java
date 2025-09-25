package control;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요 >> ");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        sc.close();

        // Math.random() : 임의의 수(난수) 추출
        // 0 이상 1 미만의 수
        int com = (int) (Math.random() * 3) + 1;
        System.out.println(com);

        switch (input - com) {
            case 2:
            case -1:
                System.out.println("당신이 졌습니다..");
                break;
            case -2:
            case 1:
                System.out.println("당신이 이겼습니다!");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
            default:
                System.out.println("잘못 입력 하셨습니다.");
                break;
        }
    }
}
