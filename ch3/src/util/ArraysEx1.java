package util;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        // 배열 복사
        int[] newArr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.arraycopy(arr, 0, newArr, 0, 0);
        Arrays.copyOf(arr, 0);

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyArr));

        int[] copyArr2 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(copyArr2));
    }
}
