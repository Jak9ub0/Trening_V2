package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Zadanie: Napisz program proszacy uzytkownika o wprowadzenie liczby,
 zabezpieczcie program przed wprowadzeniem z klawiatury zmiast liczbe textm obslugujac to mechanizmem try catch
 */
public class WyajtekZadanie {
    public static void main(String[] args) {
        int wiek;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj swój wiek: ");

        try {
            wiek= scanner.nextInt();
            System.out.println(wiek);
        }catch (InputMismatchException e)
        {
            System.out.println("podałeś inny znak, niż cyfry");
        }  finally {
            System.out.println("zamykam program");
        }
    }
}
