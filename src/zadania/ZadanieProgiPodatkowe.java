package zadania;

import java.util.Scanner;

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
