package dataczas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Zadanie: pobierzcie aktualna date dodajcie do niej rok a nastepnie wyswietlcie w formacie np. 12 March 2020, oraz obok wyprintujcioe jaki to dzien tygodnia

 */
public class LocalDataZadanie {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE, e")) + " dzień tygodnia");
    }
}
