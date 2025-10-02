package inheritance;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // void buy(SamsungTV tv) {

    // }

    // void buy(Computer computer) {

    // }

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족 합니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + " 를 구매 하셨습니다.");
    }
}
