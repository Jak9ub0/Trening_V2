package zadania;

import java.util.Scanner;
/*
Napisz program, który wyświetli linię długości wskazanej przez użytkownika, np.
2->##
5->#####
10->##########
 */
public class ZadaniePlotek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość: ");
        int length = scanner.nextInt();
        for (int i=0;i<length;i++) {
            System.out.print("#");
        }
    }
}
