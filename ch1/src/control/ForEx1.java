package control;

public class ForEx1 {
    public static void main(String[] args) {
        // 초기화 : int i = 0;
        // 조건식 : i < args.length;
        // 증감식 : i++;
        for (int i = 0; i < args.length; i++) {
            // 조건식이 참인 동안 반복적으로 수행할 문장
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "안녕하세요");
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i + "안녕하세요");
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i + "안녕하세요");
        }

        // 변수 2개 이상도 가능
        for (int i = 10, j = 1; i > 0; i--, j++) {
            System.out.println(j + "안녕하세요");
        }

        // 1 ~ 10까지 출력
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // 1 ~ 10까지 합계 구하기
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1 ~ 10까지의 합 " + sum);

    }
}
