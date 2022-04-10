package zadania;

import java.util.Scanner;

public class ZadaniePrzekopiowanieTablicy {

    public static void main(String[] args) {
        int[] tablica1 = new int[5];
        int[] tablica2 = new int[5];

        for(int i = 0; i < tablica1.length; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj dane dla elementu nr " +(i+1));
            tablica1[i] = scanner.nextInt();
        }
        for (int i = tablica1.length-1; i >0; i--) {
            tablica2[i] = tablica1[i];
        }

        for (int i =0; i <tablica2.length; i++) {
            System.out.println(tablica2[i]);
        }


    }
}
