package control;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던지고
        // 눈의 합이 5이면 주사위 던지기 멈춤
        // 주사위 던져서 나온 눈 표시 ex) (1, 3)
        int i = 0;
        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;

            ++i;
            System.out.printf("%d 회차 : (%d , %d)\n", i, dice1, dice2);
            if (sum == 5) {
                break;
            }
        }
    }
}
