package lang;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = "hello world";

        // 문자열 거꾸로 출력하기
        String result = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            result += str1.charAt(i);
        }
        System.out.println(result);

        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.reverse());
    }
}
