package object;

import java.util.Scanner;

public class AccountEx3 {
    static Scanner sc = new Scanner(System.in); // 공유하여 사용하기 위해

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // 배열 선언과 생성
        Account[] accounts = new Account[100];
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.print("선택 >> ");
            int no = Integer.parseInt(sc.nextLine());

            switch (no) {
                case 1:
                    createAccount(accounts);
                    break;
                case 2:
                    accountList(accounts);
                    break;
                case 3:
                    deposit(accounts);
                    break;
                case 4:
                    withdraw(accounts);
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램을 종료 합니다..");
                    break;
                default:
                    System.out.println("메뉴 번호를 확인 해주세요.");
                    break;
            }
        }
    }

    // 계좌 생성
    static void createAccount(Account[] accounts) {
        System.out.print("계좌번호 입력 : ");
        String accountNo = sc.nextLine();
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                break;
            }
        }
    }

    // 출금 담당
    static void withdraw(Account[] accounts) {
        Account account = findAccount(accounts);

        if (account == null) {
            System.out.println("계좌번호를 확인 하세요!");
        } else {
            // 출금액 입력 받아 계좌 잔액 차감
            System.out.print("출금액 입력 >> ");
            long output = Long.parseLong(sc.nextLine());
            account.withdraw(output);
            System.out.println("현재 잔액 : " + account.getBalance());
        }
    }

    // 입금 담당
    static void deposit(Account[] accounts) {
        Account account = findAccount(accounts);

        if (account == null) {
            System.out.println("계좌번호를 확인 하세요!");
        } else {
            // 입금액 입력 받아 계좌 잔액 추가
            System.out.print("입금액 입력 >> ");
            long input = Long.parseLong(sc.nextLine());
            account.deposit(input);
            System.out.println("현재 잔액 : " + account.getBalance());
        }
    }

    static Account findAccount(Account[] accounts) {
        // 입력받은 계좌번호와 일치하는 계좌 찾기
        System.out.print("계좌번호 입력 >> ");
        String accountNo = sc.nextLine();

        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) {
                    return account;
                }
            }
        }
        return null;
    }

    static void accountList(Account[] accounts) {
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("========================================================");
                System.out.println("1. 계좌번호 : " + account.getAccountNo());
                System.out.println("2. 계좌주 : " + account.getOwner());
                System.out.println("3. 잔액 : " + account.getBalance());
            }
        }
    }
}
