package object;

public class AccountEx {
    public static void main(String[] args) {
        // Account 인스턴스 생성
        Account account = new Account("123-11-222", "이유곤", 100000);

        // 입금 후 잔액
        account.deposit(50000);
        System.out.println(account.getBalance());

        // 출금 후 잔액
        System.out.println(account.withdraw(30000));

        Account account2 = new Account("121-11-2222", "일오팔", 150000);
        System.out.println(account2.getAccountNo());
        System.out.println(account2.getOwner());
        System.out.println(account2.getBalance());
    }
}
