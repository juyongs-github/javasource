package lang;

public class Account {
    // 은행 계좌
    // 계좌 번호, 계좌주, 잔액
    private String accountNo;
    private String owner;
    private long balance;

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo, String owner) {
        // this.accountNo = accountNo;
        this(accountNo);
        this.owner = owner;
    }

    public Account(String accountNo, String owner, long balance) {
        // this.accountNo = accountNo;
        // this.owner = owner;
        this(accountNo, owner);
        this.balance = balance;
    }

    // 기능 : 입금, 출금
    void deposit(long amount) {
        balance += amount;
    }

    long withdraw(long amount) throws BalanceNotEnoughException {
        // 잔액 안에서 출금 허용
        if (amount > balance) {
            throw new BalanceNotEnoughException("잔액 부족");
        }
        return balance -= amount;
    }

    // 속성 값 조회 : get으로 시작
    public String getAccountNo() {
        return this.accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
