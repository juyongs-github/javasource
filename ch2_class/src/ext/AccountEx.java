package ext;

public class AccountEx {
    public static void main(String[] args) {
        // Account 계좌 3개 생성
        Account account1 = new Account("111", "안유진", 10000);
        Account account2 = new Account("222", "고윤정", 10000);
        Account account3 = new Account("333", "미연", 10000);

        // 배열
        // 배열 생성
        int[] arr = new int[3];
        // 초기화
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 6;

        // 배열 생성 + 초기화
        int[] arr2 = { 1, 2, 3 };

        // Account 배열
        Account[] accounts = new Account[3];
        accounts[0] = new Account(null, null, 0);
        accounts[1] = new Account(null, null, 0);
        accounts[2] = new Account(null, null, 0);

        // 생성 + 초기화
        Account[] accounts2 = { new Account(null, null, 0), new Account(null, null, 0), new Account(null, null, 0) };
    }
}
