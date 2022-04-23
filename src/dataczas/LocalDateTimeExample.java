package dataczas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("aktualna data i czas to: "+ localDateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss");
        System.out.println("aktualna data i czas po sformatowaniu to: "+ localDateTime.format(dtf));
    }
}
