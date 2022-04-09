package zadania;

import java.util.Scanner;
/*
   Zdeklaruj zmienną temp_F typu float;
   następnie na podstawie wartości zmiennej oblicz wartość w Celsjuszach: C = (F - 32) * 5 / 9
    */
/*
        //Zdeklaruj zmienną typu float reprezentującą temperaturę w stopniach C
        //następnie na podstawie wzoru dokonaj konwersji do temp w K: K = C + 273.15
 */
public class ZadanieTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperature w Fahrenheitah: ");
        float temp_F = scanner.nextInt();

        float celc = (temp_F-32)*5/9;

        System.out.println("Temperatura w stopniach Celcjusza to: " + celc);

        System.out.println("Podaj temperature w C: ");
        float temp_C = scanner.nextInt();

        double K = temp_C+ 273.15; // tu nie chcial przyjac float

        System.out.println("Temperatura w Kelwinach to: " + K);
    }
}
