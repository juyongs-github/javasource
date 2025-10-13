package exam;

public class Parent {
    // 맴버변수(속성)는 외부 접근 차단
    private int num1;
    String name;
    protected String grade;

    private int print() {
        return 0;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return this.num1;
    }
}
