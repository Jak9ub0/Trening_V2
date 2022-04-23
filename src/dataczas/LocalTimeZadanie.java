package dataczas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeZadanie {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime addedTime = localTime.plusHours(2).plusMinutes(2);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH/mm");
        System.out.println("wyjsciowy czas czas : "+ localTime);
        System.out.println("zmodyfikowany czas : "+ addedTime.format(dateTimeFormatter));
    }
}
