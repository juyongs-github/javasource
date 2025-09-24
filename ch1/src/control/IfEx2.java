package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 점수를 입력받아 A, B, C, D 등급 출력
        // A => 90 이상, B => 80 이상, C => 70 이상, 그 외는 D
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = Integer.parseInt(sc.nextLine());

        // if (score >= 90) {
        // System.out.println("등급 : A");
        // } else if (score >= 80) {
        // System.out.println("등급 : B");
        // } else if (score >= 70) {
        // System.out.println("등급 : C");
        // } else {
        // System.out.println("등급 : D");
        // }

        // 변수 유효범위
        // 선언 위치에 따라 사용 범위가 달라짐
        char grade = ' ';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.printf("등급 : %c", grade);
    }
}
