package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        // 시스템 날짜와 시간 가져오기
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));
    }
}
