package inheritance;

import java.nio.channels.Pipe.SourceChannel;

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
            System.out.println("마이너스 한도 계좌 지불 후 잔액 : " + creditLineAccount.withdraw(3000000));
            // System.out.println("마이너스 한도 계좌 지불 후 잔액 : " +
            // creditLineAccount.withdraw(2000000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 보너스 포인트 적립
        BonusPointAccount bonusPointAccount = new BonusPointAccount("222", "이몽룡", 0, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());
        bonusPointAccount.deposit(50000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        // 교통카드
        CheckingTrafficCardAccount cardAccount1 = new CheckingTrafficCardAccount("333", "변사또", 100000, "222", true);
        CheckingTrafficCardAccount cardAccount2 = new CheckingTrafficCardAccount("444", "개냥이", 100000, "444", false);

        // 예금 기능
        cardAccount1.deposit(10000);
        cardAccount2.deposit(20000);
        try {
            // 출금 기능
            System.out.println("1번 카드 출금 후 잔액 : " + cardAccount1.withdraw(50000));
            System.out.println("2번 카드 출금 후 잔액 : " + cardAccount2.withdraw(70000));
            // 교통카드 기능 있을 때 교통카드 사용액 지불
            System.out.println("1번 카드 교통비 지급 후 잔액 : " + cardAccount1.payTrafficCard("222", 2100));
            // 교통카드 기능 없을 때 교통카드 사용액 지불
            System.out.println("2번 카드 교통비 지급 후 잔액 : " + cardAccount2.payTrafficCard("444", 2100));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
