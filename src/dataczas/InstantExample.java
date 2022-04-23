package dataczas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class InstantExample {

    public static void main(String[] args) {
        long seconds = Instant.now().getEpochSecond();
        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC);
        System.out.println(seconds);
        System.out.println(dateTime);
    }
}
