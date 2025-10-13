package exam;

public abstract class OddDetector {
    private int n;

    public OddDetector(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    abstract boolean isOdd();
}
