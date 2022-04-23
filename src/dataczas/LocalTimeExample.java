package dataczas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.now();
        System.out.println("Now is the time: " + localTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        System.out.println("Now is the formatted time : " + localTime.format(dtf));
        System.out.println("Now is the time: " + localTime);


        System.out.println("changed hours to 15: " + localTime.withHour(15));
        System.out.println("added 4 hours " + localTime.plusHours(4));
        System.out.println("number of seconds " + localTime.getSecond());
    }
}
