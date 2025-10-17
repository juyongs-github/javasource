package util;

import java.util.*;

public class ListEx3 {
    public static void main(String[] args) {
        // Member 객체를 List에 담기
        List<Member> list1 = new ArrayList<>();
        list1.add(new Member("qwer1", "qwer1", "쵸단"));
        list1.add(new Member("qwer2", "qwer2", "마젠타"));
        list1.add(new Member("qwer3", "qwer3", "히나"));
        list1.add(new Member("qwer4", "qwer4", "시연"));

        // 2번째 Member 조회
        Member member1 = list1.get(1);
        System.out.println("이름 : " + member1.getName());

        // 전체 Member 조회
        System.out.println("----------------------------------");
        System.out.println("아이디\t비밀번호\t이름");
        System.out.println("----------------------------------");
        for (Member member : list1) {
            System.out.printf("%s\t%s\t%s\n", member.getId(), member.getPassword(), member.getName());
        }

        System.out.println();
        for (int i = 0; i < list1.size(); i++) {
            Member m = list1.get(i);
            System.out.printf("%s\t%s\t%s\n", m.getId(), m.getPassword(), m.getName());
        }
    }
}
