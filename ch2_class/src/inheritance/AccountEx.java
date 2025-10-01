package inheritance;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 100000, "111-22");

        /*
         * // 입금
         * checkingAccount.deposit(200000);
         * // 입금 후 잔액
         * System.out.println("잔액 : " + checkingAccount.getBalance());
         * // 체크카드 사용
         * try {
         * System.out.println("체크카드 지불 후 잔액 : " + checkingAccount.pay("111-22",
         * 350000));
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         */

        CreditLineAccount creditLineAccount = new CreditLineAccount("123", "성춘향", 100000, 5000000);

        // 출금
        try {
            System.out.println("마이너스 한도 계좌 지불 후 잔액 : " + creditLineAccount.withdraw(5000000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
