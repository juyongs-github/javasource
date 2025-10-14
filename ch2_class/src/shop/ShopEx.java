package shop;

public class ShopEx {
    public static void main(String[] args) {
        TV tv = new TV("삼성TV", 2300000, "4K");
        CellPhone cellPhone = new CellPhone("갤럭시 Z폴드", 1200000, "LGU+");

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV(null, 0, null);
        // tvs[1] = new TV(null, 0, null);
        // tvs[2] = new TV(null, 0, null);

        // CellPhone[] cellPhones = new CellPhone[3];
        // cellPhones[0] = new CellPhone(null, 0, null);
        // cellPhones[1] = new CellPhone(null, 0, null);
        // cellPhones[2] = new CellPhone(null, 0, null);

        // Product[] products = new Product[5];
        // products[0] = new TV("삼성TV", 2300000, "4K");
        // products[1] = new TV("LGTV", 2250000, "4K");
        // products[2] = new CellPhone("갤럭시 Z폴드", 1200000, "LGU+");
        // products[3] = new CellPhone("갤럭시 S23", 600000, "SKT");
        // products[4] = new CellPhone("아이폰 17 PRO", 1350000, "KT");

        // for (Product product : products) {
        // product.printDetail();
        // }

        // User user = new User("제니", PayType.CARD);

        MyShop myShop = new MyShop();
        // 상점명 지정
        myShop.setTitle("잡다한 상점");
        // 사용자 등록
        myShop.getUser();
        // 상품 등록
        myShop.getProduct();
        // 상점 개장
        myShop.start();
    }
}
