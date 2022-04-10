package zadania;

import java.util.Scanner;

public class ZadanieTablica {

    public static void main(String[] args) {
        int[] tab =  new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<tab.length; i++){
            System.out.println("podaj wartosc elementu " + i);
            tab[i] = scanner.nextInt();
        }

        for (int element:tab) {
            System.out.print(element +", ");
        }
    }
}
