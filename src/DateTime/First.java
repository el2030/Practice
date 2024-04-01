package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class First {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld2 = ld.minusDays(1);
        System.out.println(ld2);

        LocalTime lt = LocalTime.now();
        LocalDateTime localDateTime = ld.atTime(lt);
        System.out.println(localDateTime);

        String date = "2023-03-29";
        LocalDate p3 = LocalDate.parse(date);
        System.out.println(p3);

        ZoneId zoneId = ZoneId.of("Pacific/Pohnpei");
        LocalTime ltz = LocalTime.now(zoneId);
        System.out.println(ltz);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        System.out.println();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
        System.out.println(localDateTime.format(dtf2));

    }
}
