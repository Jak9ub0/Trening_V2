package InstrukcjeSterujace;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

//        if(liczba == 1){
//            System.out.println("liczba jest rowna jeden");
//        } else if(liczba == 2){
//            System.out.println("Liczba jest równa dwa");
//        } else {
//            System.out.println("liczba nie jest rowna ani jeden ani dwa");
//        }

        switch (liczba) {
            case 1: System.out.println("liczba jest rowna jeden");
            break;
            case 2: System.out.println("liczba jest rowna dwa");
            break;
            default: System.out.println("liczba nie jest rowna ani jeden ani dwa");
            break;
        }
    }
}
