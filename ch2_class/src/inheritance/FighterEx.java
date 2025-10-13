package inheritance;

// 추상 클래스, 인터페이스는 직접적으로 인스턴스 생성 불가
// => 자식 클래스를 통해 인스턴스 생성 가능

public class FighterEx {
    public static void main(String[] args) {
        // Attackable attackable = new Attackable();

        Fightable fightable = new Fighter();
        Fighter fighter = new Fighter();

    }
}
