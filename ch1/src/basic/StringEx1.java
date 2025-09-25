package basic;

public class StringEx1 {
    public static void main(String[] args) {
        // 문자열
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";

        // 문자열이 같은가? ==, !=
        System.out.println(str1 == str2);
        String str3 = new String("안녕하세요");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        String str4 = "abc";
        String str5 = "ABC";
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5)); // 대소문자 관계 없이 같은지 판별
    }
}
