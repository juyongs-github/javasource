package basic;

public class Variable3 {
    public static void main(String[] args) {
        // 실수형 : float, double
        // float는 맨 끝에 F 또는 f를 붙임
        // float score1 = 50;
        float score1 = 50.15f;
        // double은 맨 끝에 D 또는 d를 붙임
        double score2 = 45.125d;
        System.out.println("score1 = " + score1); // 50.0
        System.out.println("score2 = " + score2); // 45.0
        System.out.printf("score1 = %10.2f, score2 = %5.3f", score1, score2);
    }
}
