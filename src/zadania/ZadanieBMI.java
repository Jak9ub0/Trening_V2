package zadania;

import java.util.Scanner;

/*
Napisz kalkulator BMI:
bmi = waga/ wzrost_m^2;
wzrost i waga powinny zostać przekazane przez użytkownika
 */
public class ZadanieBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kg: ");
        float weight = scanner.nextFloat();
        System.out.println("Podaj swój wzrost w m: ");
        float height = scanner.nextFloat();
        float bmi = weight/(height*height);
        System.out.print("Twoje BMI to: ");
        System.out.println(bmi);

        if (bmi > 18.5F && bmi < 24.9F) {
            System.out.println("Waga prawidłowa");
        } else if (bmi >= 24.9F) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Niedowaga");
        }
    }
}
