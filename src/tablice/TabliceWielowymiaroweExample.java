package tablice;

import java.util.Scanner;

public class TabliceWielowymiaroweExample {

    public static void main(String[] args) {
        int[][] tab = new int[3][4];

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<tab.length; i++){
            for(int j =0; j<tab[i].length; j++){
                System.out.println("podaj element dla wiersza "+ i + " i kolumny "+ j);
                tab[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i<tab.length; i++){
            for(int j =0; j<tab[i].length; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println("");
        }
    }
}
