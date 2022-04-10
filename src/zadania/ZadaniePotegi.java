package zadania;

import java.util.Scanner;

/*
Napisz program pobierający od użytkownika liczbę n i na jej podstawie wyświetlający kwadrat każdej liczby całkowitej <= n.
Dane testowe:
1->1
2->4
3->9
4->16
 */
public class ZadaniePotegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj maksymalną liczbę: ");
        int number = scanner.nextInt();//50

        for (int i=1;i<=number;i++) {
//            int pow = i*i;
            double pow = Math.pow(i,2);
//            double pow = i^2;
            System.out.println(pow);
        }


//        //alternatywnie:
//        for (int i=1;;i++){
//            int pow = i * i;
//            if (pow <= number){
//                System.out.println(pow);
//            } else {
//                break;
//            }
//        }
    }
}
