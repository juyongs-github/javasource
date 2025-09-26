package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열 (Array)
        // 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        // 타입 배열명[] = new 타입[]; 또는 타입[] 배열명 = new 타입[]; => 배열 선언과 생성
        // ex) 한 학급에 10명이 있고, 10명의 시험점수 저장
        // int score1 , score2, score3, ... score10;
        // int sum = score1 + score2 + score3 + ... + score10;
        // double avg = (double)sum / 10;

        // 정수형 초기값 : 0
        int[] arr1 = new int[10];
        System.out.println(arr1[3]);

        // 실수형 초기값 : 0.0
        double[] arr2 = new double[10];
        System.out.println(arr2[0]);

        // 논리형 초기값 : false
        boolean[] arr3 = new boolean[3];
        System.out.println(arr3[1]);

        // 문자형 초기값 : 비어있음
        char[] arr4 = new char[3];
        System.out.println(arr4[0] + "arr");

        int[] arr5; // 배열 선언
        arr5 = new int[3]; // 배열 생성

        // 배열 선언, 생성, 초기화
        int score[] = { 88, 90, 87, 86, 77, 78, 79, 75, 72, 66 };

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}
