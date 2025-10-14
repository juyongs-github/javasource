package shop;

public class TV extends Product {
    private String resolution;

    public String getResolution() {
        return this.resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public TV(String name, int price, String resolution) {
        super(name, price);
        this.resolution = resolution;
    }

    @Override
    public void printExtra() {
        System.out.println("해상도 : " + resolution);
    }

}
