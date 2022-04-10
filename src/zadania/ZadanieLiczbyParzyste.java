package zadania;

import java.util.Scanner;

/*
Napisz program, który wyświetli liczby parzyste w przedziale od 0 do n, gdzie n to liczba podana przez użytkownika, np.
n = 10
0,2,4,6,8
 */
public class ZadanieLiczbyParzyste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj koniec przedziału: ");
        int n = scanner.nextInt();
        for (int i=0;i<n;i++) {
            if (i % 2 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
