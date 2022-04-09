package zadania;

import java.util.Scanner;
/*
Napisać program obliczający należny podatek dochodowy od osób fizycznych.
Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek.
Podatek obliczany jest wg. następujących reguł:
• do wlaczanie 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
 */
public class ZadanieProgiPodatkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dochód roczny: ");
        float income = scanner.nextFloat();
        float tax;
        if (income <= 85_528F) {
            tax = income * 0.18F - 556.02F;
        } else {
            tax = 14_839.02F + (income - 85_528F) * 0.32F;
        }
        System.out.print("Należny podatek: ");
        System.out.println(tax);
    }
}
