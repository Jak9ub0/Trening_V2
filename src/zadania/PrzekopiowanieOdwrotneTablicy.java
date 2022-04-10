package zadania;

import java.util.Scanner;

public class PrzekopiowanieOdwrotneTablicy {

    public static void main(String[] args) {
        int[] nazwaTab1 = new int[5];
        int[] nazwaTab2 = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nazwaTab1.length; i++) {
            System.out.println("podaj element tablicy nr " + i);
            nazwaTab1[i] = scanner.nextInt();

        }


        System.out.println("Tablica 2: ");
        for (int i = 0; i < nazwaTab1.length; i++) {
            nazwaTab2[i] = nazwaTab1[nazwaTab1.length - i - 1];
            System.out.print(nazwaTab2[i] + ",");


        }
        System.out.println("");
        System.out.println("Tablica 1: ");
        for (int i = 0; i < nazwaTab1.length; i++) {

            System.out.print(nazwaTab1[i] + ",");
        }
    }
}
