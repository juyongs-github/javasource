package util;

import java.util.*;

public class ListEx2 {
    public static void main(String[] args) {
        // 리스트 생성
        List<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        List<String> list3 = List.of("사과", "포도", "딸기", "수박"); // 요소 변경은 불가 (Immutable)

        // 배열로 리스트 생성하기
        String[] fruits = { "사과", "포도", "딸기", "수박" };
        List<String> list4 = Arrays.asList(fruits); // 요소 변경은 불가 (Immutable)

        list1.add("사과");
        list2.add("사과");
        // list3.add("바나나"); // java.lang.UnsupportedOperationException
        // list4.add("바나나"); // java.lang.UnsupportedOperationException
        // list4.remove(0); // java.lang.UnsupportedOperationException

        String[] fruits2 = { "사과", "포도", "딸기", "수박" };
        List<String> list5 = new ArrayList<>(Arrays.asList(fruits2));
        list5.add("복숭아");
        System.out.println(list5);

        List<String> list6 = new ArrayList<>(List.of("사과", "포도", "딸기", "수박"));
        list6.add("참외");
        System.out.println(list6);
    }
}
