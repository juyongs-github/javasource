package inheritance;

public class CheckingAccount extends Account {
    private String cardNo; // 체크카드 번호

    public CheckingAccount(String accountNo, String owner, long balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;
    }

    // 체크카드 사용액을 지불
    long pay(String cardNo, long amount) throws Exception {
        // 카드번호 일치
        if (!cardNo.equals(this.cardNo)) {
            throw new Exception("카드번호를 확인 하세요!");
        }
        // 일치한다면 출금
        // 잔액 = 잔액 - 사용액
        return withdraw(amount);
    }
}
