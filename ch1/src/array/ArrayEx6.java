package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 45개의 정수값을 저장하기 위한 배열 생성
        // 각 요소에 1 ~ 45 값 저장
        int[] arr = new int[45];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // 배열의 0번째에서 5번째 요소까지
        // 모두 6개만 교환
        for (int i = 0; i < 6; i++) {
            int r = (int) (Math.random() * 45);
            int tmp = arr[i];
            arr[i] = arr[r];
            arr[r] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
