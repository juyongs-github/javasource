package exam;

public abstract class Calc {
    protected int a;
    protected int b;

    abstract void setValue(int a, int b);

    abstract int calculate();
}
