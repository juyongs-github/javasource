package lang;

// Math를 처음부터 다 끌어올려 사용
import static java.lang.Math.*;

public class MathEx {
    public static void main(String[] args) {
        // Math.random();
        double val = 90.777;
        // System.out.println("반올림 " + Math.round(val));
        // System.out.println("올림 " + Math.ceil(val));
        // System.out.println("버림 " + Math.floor(val));
        // System.out.println("PI 값 " + Math.PI);

        System.out.println("반올림 " + round(val));
        System.out.println("올림 " + ceil(val));
        System.out.println("버림 " + floor(val));
        System.out.println("0 <= x < 1 " + random());
        System.out.println("PI 값 " + PI);
    }
}
