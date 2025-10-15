package lang;

public class StringEx {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        // String str1 = new String("abc");
        String str1 = "abc";

        // 문자열을 낱개로 처리
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));

        for (char c : str1.toCharArray()) {
            System.out.println(c);
        }

        char[] ch = { 'A', 'B', 'C', 'D' };
        // char 배열 => 문자열로 변경
        String str2 = new String(ch);
        System.out.println(str2);
    }
}
