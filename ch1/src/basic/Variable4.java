package basic;

public class Variable4 {
    public static void main(String[] args) {
        // boolean : 참, 거짓 표현
        boolean flag = true;
        System.out.println(flag ? "참" : "거짓");

        // 문자형 : ''
        char ch = 'a', ch2 = '가';
        // char ch3 = 'ab'; // 두 글자 이상 X
        System.out.println("ch = " + ch + ", ch2 = " + ch2);
        System.out.printf("ch = %c, ch2 = %c\n", ch, ch2);
        // 유니코드 : 전 세계의 모든 문자를 컴퓨터에서 일관되게 표현하고 다룰 수 있도록 설계된 표준
        System.out.println("ch = " + (ch + 1)); // 98
        System.out.println("ch2 = " + (ch2 + 1)); // 44033
        System.out.printf("ch2 = %c\n", (ch2 + 1));
        System.out.printf("ch2 = %d\n", (ch2 + 1));

        // 문자열 : ""
        String str = "abc";
    }
}
