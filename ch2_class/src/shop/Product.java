package shop;

public abstract class Product {
    private String name;
    private int price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void printDetail() {
        System.out.println("제품명 : " + name);
        System.out.println("가격 : " + price);
        printExtra();
    }

    // 상품마다 추가되는 속성 출력
    public abstract void printExtra();
}
