package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx3 {
    public static void main(String[] args) {
        int[] arr = { 2, 12, 55, 32, 78, 41, 17, 9, 25 };
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // 정렬 - 선택정렬, 버블정렬, 퀵정렬
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = { "good", "height", "dog", "lion", "cat", "zero", "zoo" };
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr3));
    }
}
