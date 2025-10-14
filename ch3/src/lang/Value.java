package lang;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // obj가 Value의 instance 인지 여부 확인 후 형변환
        if (obj instanceof Value) {
            Value v = (Value) obj;

            if (this.value == v.value) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
