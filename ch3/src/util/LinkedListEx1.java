package util;

import java.util.*;

public class LinkedListEx1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // 요소 추가
        list.add("사과");
        list.add("귤");
        list.add("수박");
        list.add("멜론");
        list.add("키위");
        list.add("배");
        list.add("감");
        list.add("복숭아");
        System.out.println(list);

        // 요소 삭제
        list.remove(2);
        System.out.println(list);

        // 요소 수정
        list.set(0, "포도");
        System.out.println(list);

        // 조회
        System.out.println(list.get(3));

        // 전체 조회
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
