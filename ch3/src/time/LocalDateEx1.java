package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx1 {
    public static void main(String[] args) {
        // 자바에서 날짜, 시간 다루기
        // java.util.Date, java.util.Calendar => 예전에 많이 사용했던 package

        // java.time.LocalDate : 날짜 정보
        // java.time.LocalTime : 시간 정보
        // java.time.LocalDateTime : 날짜 + 시간 정보
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(now);

        // 년, 월, 일 가져오기
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        // 시, 분, 초 가져오기
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        // 윤년, 평년
        System.out.println("윤년인가? " + date.isLeapYear());

        // 특정 날짜 지정
        LocalDate date2 = LocalDate.of(2024, 1, 1);

        // 날짜와 시간 조작 : 더하기, 빼기
        LocalDateTime now2 = now.plusYears(1)
                .minusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .plusMinutes(5)
                .plusSeconds(6);
        System.out.println(now2);

        // 날짜와 시간 비교
        LocalDateTime startDate = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 3, 31, 18, 0, 0);

        if (startDate.isBefore(endDate)) {
            System.out.println("과정 진행중");
        } else if (startDate.isEqual(endDate)) {
            System.out.println("오늘 마감입니다.");
        } else if (startDate.isAfter(endDate)) {
            System.out.println("종료 했습니다.");
        }
    }
}
