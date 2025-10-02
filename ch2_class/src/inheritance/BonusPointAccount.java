package inheritance;

public class BonusPointAccount extends Account {
    // 보너스 포인트 적립
    private int bonusPoint;

    public BonusPointAccount(String accountNo, String owner, long balance, int bonusPoint) {
        super(accountNo, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    // 예금 + 보너스 포인트 적립
    @Override
    void deposit(long amount) {
        // 예금(부모 기능 호출)
        super.deposit(amount);
        // 보너스 포인트 적립 => 예금액의 1%
        this.bonusPoint += (int) (amount / 100);
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
