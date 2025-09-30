package object;

public class Calc {
    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        return plus(x, y) / 2;
    }

    void execute() {
        println("실행 결과 : " + avg(30, 6));
    }

    void println(String message) {
        System.out.println(message);
    }
}
