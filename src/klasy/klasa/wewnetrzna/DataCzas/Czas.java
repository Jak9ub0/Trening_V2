package klasy.klasa.wewnetrzna.DataCzas;

import java.time.LocalTime;

public class Czas {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now()
                .withSecond(0)
                .withNano(0);

        localTime = localTime.plusHours(2).plusMinutes(2);
        System.out.println("Now is the time: " + localTime);
    }
}



