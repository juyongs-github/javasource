package inheritance;

public class Point {
    int x; // 원점의 x좌표
    int y; // 원점의 y좌표

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(10, 10);
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
