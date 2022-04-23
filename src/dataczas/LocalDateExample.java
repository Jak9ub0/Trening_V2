package dataczas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("aktualna data "+ localDate);
        System.out.println("aktualna data sformatowana "+ localDate.format(dtf));

        LocalDate fixedLocalDate = LocalDate.of(2023, Month.APRIL, 11);
        System.out.println("ustawiona  data "+ fixedLocalDate);
        System.out.println("zwrocimy rok "+ fixedLocalDate.getYear());
        System.out.println("zwrocimy miesiac "+ fixedLocalDate.getMonth());
        System.out.println("dzien roku "+ fixedLocalDate.getDayOfYear());
        System.out.println("dzien tygodnia "+ localDate.getDayOfWeek());
    }
}


/*
of(year, month, dayOfMonth) - tworzy obiekt reprezentujący datę (rok, miesiąc, dzień):
LocalDate localDate = LocalDate.of(2020, Month.MARCH, 28);
System.out.println(localDate);  // 2020-03-28
getYear() - zwraca rok w formacie RRRR
getMonth() - zwraca miesiąc w formacie MM
getDayofTheMonth() - zwraca dzień miesiąca w formacie DD
getDayofTheWeek() - zwraca dzień tygodnia w formacie XX
getDayOfYear(), getDayOfWeek(), getDayOfMonth() - zwraca informację, który to odpowiednio: dzień roku, tygodnia, miesiąca
 */