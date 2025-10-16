package util;

import java.util.Arrays;

public class ArraysEx4 {
    public static void main(String[] args) {
        int[] arr = { 15, 22, 12, 76, 27, 98, 41, 31 };
        // 검색
        // 1. 순차 검색
        Arrays.sort(arr);
        int pos = Arrays.binarySearch(arr, 27);
        System.out.println("27는 " + (pos + 1) + "번째 위치함");
    }
}
