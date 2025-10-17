package util;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 요소 추가
        set.add("사과");
        set.add("귤");
        set.add("수박");
        set.add("멜론");
        set.add("키위");
        set.add("배");
        set.add("감");
        set.add("수박");
        System.out.println(set);

        // 요소 삭제
        set.remove("멜론");
        System.out.println(set);

        // 요소 수정, 중간 삽입 : X
        // set.set();

        // 전체 조회
        for (String str : set) {
            System.out.println(str);
        }

        // 특정 조회
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
