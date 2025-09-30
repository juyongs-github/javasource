package object;

public class Account {
    // 은행 계좌
    // 계좌 번호, 계좌주, 잔액
    String accountNo;
    String owner;
    long balance;

    public Account(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능 : 입금, 출금
    void deposit(long amount) {
        balance += amount;
    }

    long withdraw(long amount) {
        return balance -= amount;
    }

    // 속성 값 조회 : get으로 시작
    public long getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNo() {
        return accountNo;
    }
}
