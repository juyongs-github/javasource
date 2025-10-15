package lang;

public class WrapperEx {
    public static void main(String[] args) {
        // boolean => Boolean
        boolean b = true;
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false;

        // byte => Byte
        Byte byte1 = 1;
        Byte byte2 = Byte.valueOf(byte1);

        // char => Character
        Character ch = 'a';
        Character ch1 = Character.valueOf(ch);

        // short => Short
        // int => Integer
        Integer.parseInt("11");

        // long => Long
        Long long1 = 15L;

        // float => Float
        Float float1 = 16.5f;

        // double => Double
        Double double1 = 22.3d;
    }
}
