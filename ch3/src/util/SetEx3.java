package util;

import java.util.*;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("qwer1", "qwer1", "쵸단"));
        set.add(new Member("qwer2", "qwer2", "마젠타"));
        set.add(new Member("qwer3", "qwer3", "히나"));
        set.add(new Member("qwer4", "qwer4", "시연"));

        for (Member member : set) {
            System.out.println(member);
        }
    }
}
