package dataczas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Pandemia {
    public static void main(String[] args) {
        //System.out.println(Duration.ofHours(10).toMinutes());
        // System.out.println(Duration.between(LocalDateTime.of(), LocalDateTime.now().plusDays(2)).toMinutes()); // 2880
        //System.out.println(Period.between(LocalDate.of(2020, 3, 4), LocalDate.now()).getDays());

        LocalDate localDateStartDate = LocalDate.of(2020, 03, 02);
        LocalDate localDateEndDate = LocalDate.now();
        long days = ChronoUnit.DAYS.between(localDateStartDate, localDateEndDate);
        System.out.println(days);

    }
}