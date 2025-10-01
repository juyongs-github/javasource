package inheritance;

public class CreditLineAccount extends Account {
    // 마이너스 한도
    private long minusLimit;

    public CreditLineAccount(String accountNo, String owner, long balance, long minusLimit) {
        super(accountNo, owner, balance);
        this.minusLimit = minusLimit;
    }

    @Override
    long withdraw(long amount) throws Exception {
        // 예금액 + 마이너스 한도 안에서 출금 허용
        if (amount > balance + minusLimit) {
            throw new Exception("한도 초과");
        }
        return balance -= amount;
    }
}
