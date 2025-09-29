package object;

public class TVEx {
    public static void main(String[] args) {
        // TV 클래스의 인스턴스 생성
        TV tv = new TV();

        tv.size = 48;
        tv.channel = 3;
        tv.power = false;
        tv.color = "black";

        tv.setSize(32);
        tv.setChannel(11);
        tv.setPower(true);
        tv.setColor("red");
        System.out.println(tv);

        TV tv2 = new TV();
        tv2.setPower(true);
        tv2.setChannel(7);
        tv2.setColor("white");
        tv2.setSize(40);

        // 채널 변경 (+)
        tv2.channelUp();
        System.out.println(tv2);
    }
}
