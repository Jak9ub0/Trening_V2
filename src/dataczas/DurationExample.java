package dataczas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationExample {

    public static void main(String[] args) {
        System.out.println(Duration.ofHours(10).toMinutes());   // 10 godzin wyrażona w minutach: 600
// W przykładzie poniżej została wyliczona różnica czasu w minutach pomiędzy czasem obecnym a czasem o 2 dni póżniejszym
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes()); // 2880
// Poniżej została wyliczona liczba miesięcy pomiędzy dwoma datami
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(30)).getMonths());
    }
}
