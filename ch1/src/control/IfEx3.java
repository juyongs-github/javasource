package control;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 중첩 if
        // if 블럭 내에 또 다른 if문 포함(횟수 제한 없음)

        // if(true) {
        // if () {
        // if() {

        // } else if() {

        // } else {

        // }
        // } else {

        // }
        // } else {

        // }

        // 점수 입력받기
        // 90점 보다 크거나 같으면 A 학점
        // 90점 중에서 98점 이상은 A+ 학점
        // 95 ~ 97점 : A0 학점
        // 90 ~ 94점 : A- 학점
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력 하세요 : ");
        int score = Integer.parseInt(sc.nextLine());
        sc.close();

        char grade = ' ', opt = '0';
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 95) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 85) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);
    }

}
