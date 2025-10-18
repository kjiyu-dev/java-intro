package Class.Libraries;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    static void main() {
        // 💡 LocalDate: 현재 날짜
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(2025,12,25);
        System.out.println(today);
        System.out.println(christmas);

        // 💡 LocalTime: 현재 시간
        LocalTime nowTime = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(12,0);
        LocalTime lunchTimeDetail = LocalTime.of(12,0,30, 30);
        System.out.println(nowTime);
        System.out.println(lunchTime);
        System.out.println(lunchTimeDetail);

        // 💡 LocalDateTime: 현재 날짜 현재 시간
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime machiawase = LocalDateTime.of(2025,11,8,12,0);
        System.out.println(now);
        System.out.println(machiawase);

        today.plusDays(1); // 오늘날짜 나옴
        LocalDate tomorrow = today.plusDays(1); // 내일 날짜
        LocalDate yesterday = today.minusDays(1);

        for (LocalDate day : new LocalDate[] {today, tomorrow, yesterday}) {
            System.out.println(day);
        }

        LocalDate threeMonthsLater = today.plusMonths(3);
        LocalDate threeMonthsBefore = today.minusMonths(3);

        LocalTime hourAndHalfLater = nowTime.plusHours(1).plusMinutes(30);
        LocalTime hourLaterAndMinuteBefore = nowTime.plusHours(2).minusMinutes(10);

        LocalDateTime past = now.minusYears(29).plusMonths(2).minusDays(3);

        System.out.println(" . . . . . ");

        // 💡 ZonedDateTime: 시간대 정보를 추가로 가진다. "이 컴터가 어느시간대를 따르는가"
        ZonedDateTime nowHere = ZonedDateTime.now(); // ...시간포맷+[Asia/Seoul]
        ZonedDateTime newYorkNewYear = ZonedDateTime.of(2026,1,1,0,0,0,0, ZoneId.of("America/New_York"));
        ZonedDateTime nowNewYork = ZonedDateTime.now(ZoneId.of("America/New_York")); // 뉴욕 현재시간

        // 💡 getZone(): 시간대구역 서치
        String hereTimezone = nowHere.getZone().toString(); // Asia/Seoul

        System.out.println(" . . . . . ");

        int newYear = today.plusYears(1).getYear();
        System.out.println(newYear);
        LocalDateTime newYearSet = LocalDateTime.of(newYear,1,1,0, 0);

        // 💡 Duration: 두 날짜(시간)사이의 간격을 다루는 클래스
        Duration countDown = Duration.between(now, newYearSet);
        long[] countDownInUnits = {
                countDown.toDays(),
                countDown.toHours(),
                countDown.toMinutes(),
                countDown.toSeconds()
        };

        // 💡 DateTimeFormatter - ofPattern: 날짜 및 시간 표시 형식 지정하기
        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofPattern("1. yyyy-MM-dd");
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("2. yyyy년MM월dd일 HH:mm:ss");

    }
}
