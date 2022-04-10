package zadania;

import java.util.Scanner;
/*
Napisz program, który wyrysuje kwadrat o następującej własności:
n=4
1111
2222
3333
4444,
n=5
11111
22222
33333
44444
55555
n określa liczbę kolumn oraz liczbę wierszy
 */
public class ZadanieForWzor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar figury: ");
        int size = scanner.nextInt();

        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
