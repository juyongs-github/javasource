package object;

public class Triangle {
    // 속성 : 밑변(baseLine), 높이(height)
    // 기능 : 삼각형 너비(getArea())
    double baseLine;
    double height;

    public Triangle() {

    }

    public Triangle(double baseLine, double height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    public double getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 삼각형 너비
    double getArea() {
        return 0.5 * baseLine * height;
    }
}
