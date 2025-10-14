package lang;

// java.lang 패키지는 자동 import
import java.util.Scanner;

public class ObjectEx {
    public static void main(String[] args) {
        // String str = new String();
        // String str1 = "hello";
        Scanner sc = new Scanner(System.in);

        // 모든 클래스의 부모
        Object object1 = new Object();
        Object object2 = new Object();

        if (object1.equals(object2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        System.out.println(object1 == object2 ? "두 객체는 같다" : "두 객체는 다르다");
        System.out.println("object1 " + object1);

        String str1 = "hello", str2 = "hello";
        String str3 = new String("hello");
        System.out.println(str1.equals(str2) ? "str1 == str2" : "str1 != str2");
        System.out.println(str1.equals(str3) ? "str1 == str3" : "str1 != str3");
        System.out.println(str1 == str2 ? "str1 == str2" : "str1 != str2");
        System.out.println(str1 == str3 ? "str1 == str3" : "str1 != str3");
        System.out.println("str3 " + str3);

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        System.out.println(value1.equals(value2));
        System.out.println(value1);
    }
}
