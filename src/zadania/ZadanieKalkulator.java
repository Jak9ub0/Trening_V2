package zadania;

import java.util.Scanner;
/*
zmodyfikujcie zadanie z
kalkulatorem aby przy uzyciu
instrukcji break po wprowadzeniu
nieprawidlowej operacji wychodzil
z petli
 */
public class ZadanieKalkulator {

    public static void main(String[] args) {

        String czyKontynuowac;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj operacje");
            String operacja = scanner.next();
            if(!(operacja.equals("+")||operacja.equals("-")||operacja.equals("/")||operacja.equals("*"))){
                System.out.println("uzyles niedozwolonej operacji");
                break;
            }
            System.out.println("Podaj liczby");
            double liczba1 = scanner.nextDouble();
            double liczba2 = scanner.nextDouble();
            double wynik;

            switch (operacja) {
                case "+":
                    wynik = liczba1 + liczba2;
                    break;
                case "-":
                    wynik = liczba1 - liczba2;
                    break;
                case "*":
                    wynik = liczba1 * liczba2;
                    break;
                case "/":
                    wynik = liczba1 / liczba2;
                    break;
                default:
                    wynik = 0.0;
                    break;
            }
            System.out.println("Wynik to: " + wynik);
            System.out.println("czy kontynuowac? ");
            czyKontynuowac = scanner.next();
        } while (czyKontynuowac.equals("tak"));
    }
}
