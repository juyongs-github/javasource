package shop;

public class CellPhone extends Product {
    private String carrier;

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public CellPhone(String name, int price, String carrier) {
        super(name, price);
        this.carrier = carrier;
    }

    @Override
    public void printExtra() {
        System.out.println("통신사 : " + carrier);
    }

}
