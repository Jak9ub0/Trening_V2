package dataczas;

import java.util.Scanner;

public class Dzielenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba1;
        int liczba2;

        System.out.println("Podaj liczbe: ");
        liczba1 = scanner.nextInt();
        System.out.println("Podaj liczbe: ");
        liczba2 = scanner.nextInt();
        int wynik = 0;
        try {
            wynik = liczba1 / liczba2;
            System.out.println("Wynik dzielenia wynosi: " + wynik);
        } catch (RuntimeException e) {
            System.out.println("Nie dzielimy przez 0 !!!!");
        }
        System.out.println(wynik);
    }
        }






