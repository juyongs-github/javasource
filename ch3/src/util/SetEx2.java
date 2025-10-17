package util;

import java.util.*;

public class SetEx2 {
    public static void main(String[] args) {
        // 1 ~ 45 숫자 중 6개 무작위 추출
        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        // Set => List 변환 후 정렬
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

        // List => Set 변환
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);
    }
}
