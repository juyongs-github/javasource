package util;

import java.util.*;

public class SetEx4 {
    public static void main(String[] args) {
        // 1 ~ 45 숫자 중 6개 무작위 추출
        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println(set);

        // 정렬 되는 Set
        Set<Integer> set2 = new TreeSet<>();

        while (set2.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            set2.add(num);
        }

        System.out.println(set2);
    }
}
