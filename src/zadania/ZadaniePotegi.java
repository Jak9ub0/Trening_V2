package zadania;

import java.util.Scanner;

/*
Napisz program pobierający od użytkownika liczbę n i na jej podstawie wyświetlający kwadrat każdej liczby całkowitej <= n.
Dane testowe:
1->1
2->4
3->9
4->16
zadanie drugie : zmodyfikujcie zadanie
z obliczaniem kwadratow liczb mniejszej
od wskazanej z pominieciem nieparzystych
liczb przy uzyciu continue

 */
public class ZadaniePotegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj maksymalną liczbę: ");
        int number = scanner.nextInt();//50

        for (int i=1;i<=number;i++) {
            if(i%2!=0){
                continue;
            }
            double pow = Math.pow(i,2);
            System.out.println(i + "->" + pow);
        }
    }
}
