package array;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strArr = { "Kim", "Park", "Yi" };
        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = new String("Park");
        strArr2[2] = "Yi";

        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[0].length());

        // char 배열과 String 배열
        // String : char 배열 + 기능(메서드)
        System.out.println(strArr2[0]);
        System.out.println("strArr2[0].charAt(0) : " + strArr2[0].charAt(0));

        String str = "ABCDE";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // String => char 배열로 변환
        char[] chArr = str.toCharArray();

        // char 배열 => String 변환
        char[] chArr2 = { 'A', 'B', 'C', 'D', 'E' };
        String str2 = new String(chArr2);
        System.out.println(str2);

    }
}
