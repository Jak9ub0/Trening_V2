package dataczas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
adanie: Obliczcie ile uplynelo dni od daty wybuchu pandemii
 */
public class IleDniOdPandemiiZdanie {

    public static void main(String[] args) {
        // 1 sposob
        System.out.println(Duration.between(LocalDateTime.of(2020, 3, 4,0,0,0), LocalDateTime.now()).toDays());

        // 2 sposob
        LocalDate localDateStartDate = LocalDate.of(2020, 03, 02);
        LocalDate localDateEndDate = LocalDate.now();
        long days = ChronoUnit.DAYS.between(localDateStartDate, localDateEndDate);
        System.out.println(days);

    }
}
