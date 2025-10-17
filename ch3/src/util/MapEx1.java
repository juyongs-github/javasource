package util;

import java.util.*;
import java.util.Map.Entry;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // 추가
        map.put("1", "사과");
        map.put("2", "포도");
        map.put("3", "귤");
        map.put("4", "수박");

        // 개별 조회
        String value = map.get("1");
        System.out.println(value);

        // 전체 조회
        // key 값을 iterator 구조로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            value = map.get(key);
            System.out.println("key : " + key + " value : " + value);
        }

        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
