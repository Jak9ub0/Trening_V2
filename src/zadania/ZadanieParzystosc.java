package zadania;

import java.util.Scanner;
//Napisac program ktory sprawdzi czy wczytana liczba jest parzysta bądź nie.
public class ZadanieParzystosc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int number = scanner.nextInt();
        boolean isEven = number % 2 == 0;
        if (isEven) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
