package zadania;

import java.util.Scanner;

/*
Napisz program, który obliczy podatek dochodowy od wskazanego wynagrodzenia netto.
Przyjmij, że podatek to 19% dochodu. W tym celu:
- poproś użytkownika o podanie swojego dochodu //
- przypisz do zmiennej rezultat obliczania kwotu podatku
- wyświetl ten rezultat
 */
public class ZadaniePodatek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dochód: ");
        float salary = scanner.nextFloat();
        float tax = salary * 0.19f;
        System.out.print("Podatek do zapłaty to: ");
        System.out.println(tax);
    }
}
