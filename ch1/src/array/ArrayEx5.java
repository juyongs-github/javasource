package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 0 ~ 9의 숫자로 초기화
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        // x <=> y 값 교환
        int x = 10, y = 5;
        System.out.println("before => x : " + x + ", y : " + y);
        int swap = x;
        x = y;
        y = swap;
        System.out.println("after => x : " + x + ", y : " + y);

        // 배열 값 섞기
        for (int i = 0; i < 100; i++) {
            // 0 ~ 9 사이의 임의의 수 추출
            int r = (int) (Math.random() * 10);
            int tmp = arr[0];
            arr[0] = arr[r];
            arr[r] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
