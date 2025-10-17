package util;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");
        list1.add("복숭아");

        Set<String> set = new HashSet<>();

        set.add("사과");
        set.add("귤");
        set.add("수박");
        set.add("멜론");
        set.add("키위");
        set.add("배");
        set.add("감");
        set.add("수박");

        // 전체 조회
        // 1. forEach()
        // 2. 표준화된 방법 -> Iterator
        Iterator<String> iter1 = list1.iterator();
        Iterator<String> iter2 = set.iterator();

        while (iter1.hasNext()) {
            System.out.println("list " + iter1.next());
            System.out.println("set " + iter2.next());
        }
    }
}
