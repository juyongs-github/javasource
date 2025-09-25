package control;

public class ForEx3 {
    public static void main(String[] args) {
        // 별(*) 문자 찍기
        // **********
        // **********
        // **********
        // **********
        // **********
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단 2 ~ 9단 출력
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
