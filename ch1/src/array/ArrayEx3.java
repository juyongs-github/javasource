package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 배열은 한 번 생성하면 길이 변경 불가
        // 변경하기 위해 기존 배열 -> 새 배열로 이동해야 함
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        // 배열 복사
        int[] tmp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));

        // System.arraycopy()
        int[] tmp2 = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp2, 0, arr.length);
        System.out.println(Arrays.toString(tmp2));

        // Arrays.copyOf()
        int[] tmp3 = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(tmp3));

        // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // for (int i = 0; i < tmp.length; i++) {
        // System.out.println(arr[i]);
        // }

        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        // 배열 abc와 num을 하나의 배열로 만들기
        char[] result1 = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result1, 0, abc.length);
        System.arraycopy(num, 0, result1, abc.length, num.length);
        System.out.println(Arrays.toString(result1));
    }
}
