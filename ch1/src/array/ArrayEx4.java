package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        // 최대값과 최소값 출력;
        int min = score[0], max = score[0];
        for (int s : score) {
            // 최소값
            if (min > s) {
                min = s;
            }
            // 최대값
            if (max < s) {
                max = s;
            }
        }
        System.out.println("최소값 : " + min + " 최대값 : " + max);
    }
}
