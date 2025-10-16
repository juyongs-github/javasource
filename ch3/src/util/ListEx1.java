package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Collection Framework
// => 데이터를 담아서 처리하는 방법
// Collection
// - List (= 배열 개념과 동일)
//   - ArrayList, Vector, LinkedList, Stack, ...
// - Set
//   - HashSet, TreeSet, ...
// - Map
//   - HashMap, TreeMap, ...

public class ListEx1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        // add => 원소 추가
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");
        list1.add("복숭아");

        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println("리스트 전체 개수 : " + list1.size());

        // remove
        list1.remove(0);
        System.out.println(list1);
        list1.remove("수박");
        System.out.println(list1);

        // 특정 위치의 요소값 변경
        list1.set(0, "포도");
        System.out.println(list1);

        // 삽입
        list1.add(2, "딸기");
        System.out.println(list1);

        for (String str : list1) {
            System.out.println(str);
        }

        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
}
