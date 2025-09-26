package array;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 2차원 배열
        int[][] score = new int[3][4]; // 3행 4열
        score[0][0] = 78;
        score[1][1] = 68;

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println(score.length);
        System.out.println(score[0].length);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println();
        }

        // 2차원 배열은 가변 배열이 가능(단, 행 개수는 고정)
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];

        int[][] jumsu = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 60, 70, 60 },
                { 60, 80, 70 }
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0; // 국어, 수학, 영어 총점
        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("=============================================");
        for (int i = 0; i < jumsu.length; i++) {
            // 개인별 총점, 평균 변수
            int sum = 0;
            float avg = 0.0f;
            korTotal += jumsu[i][0];
            engTotal += jumsu[i][1];
            mathTotal += jumsu[i][2];

            System.out.printf("%3d", i + 1);

            for (int j = 0; j < jumsu[i].length; j++) {
                sum += jumsu[i][j];
                avg = sum / (float) jumsu[i].length;
                System.out.printf("%8d", jumsu[i][j]);
            }
            System.out.printf("%8d %8.1f\n", sum, avg);
        }
        System.out.println("=============================================");
        System.out.printf("총점 %6d %7d %7d", korTotal, engTotal, mathTotal);
    }
}
