package shop;

import java.util.Scanner;

public class MyShop implements IShop {
    private String title;
    Product[] products = new Product[5]; // 상품
    Product[] carts = new Product[5]; // 장바구니
    User[] users = new User[2]; // 사용자
    User selUser;

    public void setTitle(String title) {
        this.title = title;
    }

    // 메뉴
    @Override
    public void start() {
        System.out.println(title + " : 메인 화면 - 계정 선택");
        System.out.println("==================================");

        for (int i = 0; i < users.length; i++) {
            System.out.println("[" + i + "] " + users[i].getName() + " (" + users[i].getPayType() + ")");
        }

        System.out.println("[x] 종료");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("## " + input + " 선택 ##");

        if (input.equals("x")) {
            System.out.println("프로그램을 종료 합니다...");
            System.exit(0);
        } else {
            int idx = Integer.parseInt(input);
            selUser = users[idx];
            productList();
        }
    }

    // 상품 출력
    @Override
    public void productList() {
        System.out.println(title + " : 상품 목록 - 상품 선택");
        System.out.println("==================================");

        for (int i = 0; i < products.length; i++) {
            System.out.printf("[%d] ", i);
            products[i].printDetail();
        }

        System.out.println("[h] 메인 화면");
        System.out.println("[c] 체크 아웃");
        System.out.print("선택 : ");

        // 상품 번호 선택 시 => 장바구니에 담기
        // 상품 목록 보여주기
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("h")) {
            start();
        } else if (input.equals("c")) {
            checkOut();
        } else {
            int idx = Integer.parseInt(input);
            for (int i = 0; i < carts.length; i++) {
                if (carts[i] == null) {
                    carts[i] = products[idx];
                    break;
                }
            }
            productList();
        }
    }

    // 결제 처리
    @Override
    public void checkOut() {
        System.out.println(title + " : 체크 아웃");
        System.out.println("==================================");

        int total = 0;
        for (int i = 0; i < carts.length; i++) {
            if (carts[i] != null) {
                System.out.printf("[%d] %s (%d)\n", i, carts[i].getName(), carts[i].getPrice());
                total += carts[i].getPrice();
            }
        }

        System.out.println("==================================");
        System.out.println("결제 방법 : " + selUser.getPayType());
        System.out.println("합계 : " + total + "원 입니다.");
        System.out.println("[p] 이전 , [q] 결제 완료");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("p")) {
            productList();
        } else if (input.equals("q")) {
            System.out.println("### 결제가 완료 되었습니다. ###");
            System.exit(0);
        } else {
            checkOut();
        }
    }

    // 사용자 등록
    @Override
    public void getUser() {
        users[0] = new User("김우빈", PayType.CARD);
        users[1] = new User("수지", PayType.CASH);
    }

    // 상품 등록
    @Override
    public void getProduct() {
        products[0] = new TV("삼성TV", 2300000, "4K");
        products[1] = new TV("LGTV", 2250000, "4K");
        products[2] = new CellPhone("갤럭시 Z폴드", 1200000, "LGU+");
        products[3] = new CellPhone("갤럭시 S23", 600000, "SKT");
        products[4] = new CellPhone("아이폰 17 PRO", 1350000, "KT");
    }
}
