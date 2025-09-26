package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        char[] arr1 = { 'a', 'b', 'c', 'd' };
        double[] arr2 = { 99.8, 85.2, 77.8, 63.8 };
        String[] arr3 = { "bear", "snow", "sun" };

        // 1 ~ 10 임의의 수 생성 후 초기화
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 10) + 1;
        }

        // 배열 길이가 명확하지 않는 경우 => ex) 입력 값으로 결정
        int[] arr5;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        arr5 = new int[input];

        // 배열 출력
        // 배열명으로 출력 시 해당 배열의 주소값 출력
        // Arrays.toString() : 배열이 가지고 있는 실제 값 출력
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        // for 출력
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // 향상된 for문(for-each)
        for (char ch : arr1) {
            System.out.println(ch);
        }

        for (double d : arr2) {
            System.out.println(d);
        }

        for (String str : arr3) {
            System.out.println(str);
        }

        for (int i : arr5) {
            System.out.println(i);
        }
    }
}
