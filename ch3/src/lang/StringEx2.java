package lang;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        // 1. concat()
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str1.concat(str2));

        // 2) contains()
        boolean result = str3.contains(str1);
        System.out.println(result);
        if (result) {
            System.out.println("포함됨");
        } else {
            System.out.println("포함되지 않음");
        }

        // 3) compareTo() : 문자열을 사전 순으로 비교
        str1 = "aaa";
        str2 = "bbb";
        System.out.println(str1.compareTo("aaa"));
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));

        // 4) endsWith() : 지정된 문자열로 끝나는지 검사
        String fileName = "file1.txt";
        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 아님");
        }

        // 5) equals() : 문자열 비교, equalsIgnoreCase() : 대소문자 구분 없이 비교
        System.out.println("aaa".equals("ccc"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));

        // 6) indexOf() : 문자의 위치값(index) 리턴
        str1 = "hello";
        System.out.println(str1.indexOf("e"));
        System.out.println(str1.indexOf("p"));
        System.out.println(str1.indexOf("h", 2)); // 2번 index 부터 시작해서 'h'를 찾기

        // 7) lastIndexOf() : 뒤에서 부터 문자의 위치값(index) 리턴
        str1 = "java.lang.Object";
        System.out.println(str1.lastIndexOf("."));
        System.out.println(str1.indexOf("."));

        // 8) length() => 배열은 length
        int[] arr = { 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {

        }

        // 9) replace()
        str1 = "hello";
        System.out.println(str1.replace('h', 'b'));
        System.out.println(str1);
        System.out.println("hellollo".replace("ll", "LL"));
        System.out.println("hellollo".replaceFirst("ll", "LL"));
        System.out.println("hellollo".replaceAll("ll", "LL"));

        // 10) split()
        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        for (String animal : arr2) {
            System.out.println(animal);
        }
        String[] arr3 = animals.split(",", 2);
        System.out.println(Arrays.toString(arr3));

        // 11) startsWith() : 지정된 문자열로 시작하는지 검사
        str1 = "java.lang.Object";
        System.out.println(str1.startsWith("java"));
        System.out.println(str1.startsWith("lang"));
        System.out.println(str1.startsWith("lang", 5));

        // 12) substring() : 문자열 자르기
        System.out.println(str1.substring(10));
        System.out.println(str1.substring(5, 9));

        // 13) toLowerCase(), toUpperCase()
        System.out.println("abcDEFG".toLowerCase());
        System.out.println("ABCdefg".toUpperCase());

        // 14) trim() : 양 끝에 존재하는 공백 제거 (중간 공백은 제거 X)
        System.out.println("        hello World".trim());
        System.out.println("        hello World                   ".trim());
        System.out.println("        hello            World              ".trim());

        // 15) valueOf() : 지정된 값을 문자열로 변환
        String str4 = String.valueOf(3);
        str4 = String.valueOf(10.3f);
        System.out.println(str4);
    }
}
