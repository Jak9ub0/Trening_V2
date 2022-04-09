package opeartory;

import java.util.Scanner;

/*
Napisz program, który zweryfikuje czy dany użytkownik może obejrzeć seans w kine.
Warunkiem wejścia do kina jest: 20 w portfelu, albo karta klubowicza, albo przybycie z 3 dzieci.
Pytanie o pieniądze, kartę klubowicza i liczbę dzieci powinny być zadane użytkownikowi przed rozpoczęciem weryfikacji (skorzystaj z scanner)
 */
public class ZadanieKino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile masz pieniędzy w portfelu: ");
        float cash = scanner.nextFloat();
        System.out.println("Czy posiadasz kartę klubowicza: ");
        boolean hasPremiumCard = scanner.nextBoolean();
        System.out.println("Podaj liczbę dzieci: ");
        byte numberOfChildren = scanner.nextByte();
        boolean canGoToCinema = (cash >= 20.0f) || hasPremiumCard || (numberOfChildren >= 3);
        System.out.println("Opdowiedź systemu: ");
        if(canGoToCinema) {
            System.out.println("Mozesz wejsc do kina");
        } else {
            System.out.println("Nie mozesz wejsc do kina");
        }
    }
}
