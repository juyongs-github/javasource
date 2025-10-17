package util;

public class BoxEx1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.setItem("홍길동"); // new String("홍길동")
        String name = (String) box1.getItem();
        box1.setItem(33); // Integer.valueOf(33)
        Integer i = (Integer) box1.getItem();
        box1.setItem(12.34); // Double.valueOf(12.34)
        Double d = (Double) box1.getItem();

        Box2<String> box2 = new Box2<>();
        box2.setItem(name);
        String data = box2.getItem();
    }
}
