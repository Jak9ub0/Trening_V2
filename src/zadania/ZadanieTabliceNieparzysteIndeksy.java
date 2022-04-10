package zadania;

import java.util.Scanner;

public class ZadanieTabliceNieparzysteIndeksy {

    public static void main(String[] args) {
        int[] nazwaTablicy = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<nazwaTablicy.length; i++){
            System.out.println("podaj element tablicy nr "+ i);
            nazwaTablicy[i] =scanner.nextInt();
        }

        for(int i = 0; i< nazwaTablicy.length; i++){
            if(i%2!=0){
                System.out.println(nazwaTablicy[i]);
            }
        }
    }
}
