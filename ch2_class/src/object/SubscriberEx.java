package object;

public class SubscriberEx {
    public static void main(String[] args) {
        SubscriberInfo subscriber = new SubscriberInfo();
        subscriber.setId("test");
        subscriber.setName("성이름");
        subscriber.changePassword("hey123$%^");
        subscriber.changePhone("010-9999-8888");

        // 가입자 정보 조회
        // 1. 간단 조회 : toString()
        // 2. 개별 조회 : get~()
        System.out.println(subscriber.toString());

        System.out.println(subscriber.getId());
        System.out.println(subscriber.getName());
        System.out.println(subscriber.getPassword());
        System.out.println(subscriber.getPhone());
    }
}
