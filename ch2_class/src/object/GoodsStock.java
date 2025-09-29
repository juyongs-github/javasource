package object;

public class GoodsStock {
    // 속성 : 상품명, 수량
    String name;
    int amount;

    // 기본 생성자
    GoodsStock() {

    }

    GoodsStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // getter & setter 메소드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "GoodsStock [name=" + name + ", amount=" + amount + "]";
    }
}
