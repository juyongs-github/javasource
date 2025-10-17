package util;

public class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

class Juice {
    String name;

    public Juice(String name) {
        this.name = name + " Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    // 와일드 카드
    // - <? extends T> : T와 그 자손들만 가능
    // - <? super T> : T와 그 조상들만 가능
    // - <?> : 제한 없음
    static Juice makeJuice(Box3<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}