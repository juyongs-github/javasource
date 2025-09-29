package object;

public class TV {
    // 속성 : 크기, 채널, 파워, 색상
    int size;
    int channel;
    boolean power;
    String color;

    // 생성자
    public TV() {

    }

    // 생성자 (매개변수)
    public TV(int size, int channel, boolean power, String color) {
        this.size = size;
        this.channel = channel;
        this.power = power;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    // 기능 : 채널변경, 전원여부, 볼륨조절
    public void channelUp() {
        ++this.channel;
    }

    public void channelDown() {
        --this.channel;
    }

}
