package klasy;

import java.util.Scanner;

import static klasy.Ciasto.metodaStatyczna;

public class CiastoMain {
    public static void main(String[] args) {

        metodaStatyczna();

        Scanner scanner = new Scanner(System.in);
        Ciasto ciasto = new Ciasto();

        System.out.println("podaj ilosc wody");
        ciasto.setWoda(scanner.nextInt());

        System.out.println("podaj ilosc maka");
        ciasto.setMaka(scanner.nextInt());

        System.out.println("podaj ilosc cukier");
        ciasto.setCukier(scanner.nextInt());

        ciasto.ileWazyCiasto();
        System.out.println("ile zjesz ciasta?");
        ciasto.zjedzKawalek(scanner.nextInt());
        ciasto.ileWazyCiasto();

    }
}
