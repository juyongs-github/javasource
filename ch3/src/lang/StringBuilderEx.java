package lang;

// String => immutable(변경 불가)
// StringBuffer, StringBuilder => mutable(원본 변경 가능)
// 멀티 쓰레드(main 이외 다른 작업도 가능) / 단일 쓰레드(main만 돌아감)

public class StringBuilderEx {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        StringBuilder sb = new StringBuilder();

        String str1 = "abc";
        str1.concat("def"); // 원본 바뀌지 않고 새로운 문자열 생성

        sb.append("abc").append("def"); // 원본에 지정한 문자열 덧붙임 (원본 변경)
        System.out.println(sb);

        sb.delete(0, 2); // 지정 위치의 문자열 지우기
        System.out.println(sb);
        sb.deleteCharAt(0); // 지정 위치의 문자 지우기
        System.out.println(sb);
        sb.insert(1, "하이"); // 지정 위치에 문자열 삽입
        System.out.println(sb);
        sb.replace(1, 3, "바이"); // 지정 위치에 문자열 대체
        System.out.println(sb);
        sb.reverse(); // 문자열 뒤집기
        System.out.println(sb);

        sb = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb.equals(sb2));

        // StringBuilder => String
        str1 = sb.toString();
        String str2 = new String(sb2);
        System.out.println(str1.equals(str2));

    }
}
