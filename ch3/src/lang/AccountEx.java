package lang;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("111", "장원영", 10000);
        try {
            account.withdraw(20000);
        } catch (BalanceNotEnoughException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
