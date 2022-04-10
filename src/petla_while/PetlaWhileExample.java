package petla_while;

import java.util.Scanner;

public class PetlaWhileExample {

    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello world");
//        }

//        int i = 1;
//        while (i<=10){
//            System.out.println("Hello world " + i );
//            i++;
//        }

        int liczba;
        do {
            System.out.println("podaj liczbe z przedzialu 1-15");
            Scanner scanner = new Scanner(System.in);
            liczba = scanner.nextInt();
            System.out.println("wpisana liczba to " + liczba);
        }
        while (liczba != 10);
    }
}
