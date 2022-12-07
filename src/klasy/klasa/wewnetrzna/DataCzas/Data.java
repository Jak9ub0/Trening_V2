package klasy.klasa.wewnetrzna.DataCzas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        localDate = localDate.plusYears(1);
        System.out.println(localDate.format(dtf));
        System.out.println(localDate.getDayOfWeek());
    }}
