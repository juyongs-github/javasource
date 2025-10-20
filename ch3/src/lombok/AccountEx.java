package lombok;

public class AccountEx {
    public static void main(String[] args) {
        // 1. 생성자로 멤버 변수 세팅
        Account account = new Account("김롬복", "101", 12000);
        System.out.println(account);

        // 2. Setter로 멤버 변수 세팅
        Account account2 = new Account();
        account2.setName("이롬복");
        account2.setAccNo("102");
        account2.setBalance(15000);
        System.out.println(account2);

        // 3. Builder 패턴으로 멤버 변수 세팅 (lombok 사용해야 함)
        Account account3 = Account.builder()
                .name("박롬복")
                .accNo("103")
                .balance(20000)
                .build();
        System.out.println(account3);
    }
}
