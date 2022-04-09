package zadania;

import java.util.Scanner;

public class ZadanieMiesiace {
    public static void main(String[] args) {
        System.out.println("Podaj numer miesiąca, w którym się urodziłeś");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        String miesiac = "";

        switch (liczba) {
            case 1:
                miesiac = "Styczen";
                break;
            case 2:
                miesiac = "Luty";
                break;
            case 3:
                miesiac = "marzec";
                break;
            case 4:
                System.out.println("Urodziłeś się w kwietniu!");
                break;
            case 5:
                System.out.println("Urodziłeś się w maju!");
                break;
            case 6:
                System.out.println("Urodziłeś się w czerwcu!");
                break;
            case 7:
                System.out.println("Urodziłeś się w lipcu!");
                break;
            case 8:
                System.out.println("Urodziłeś się w sierpniu!");
                break;
            case 9:
                System.out.println("Urodziłeś się w wrześniu!");
                break;
            case 10:
                System.out.println("Urodziłeś się w październiku!");
                break;
            case 11:
                System.out.println("Urodziłeś się w listopadzie!");
                break;
            case 12:
                System.out.println("Urodziłeś się w grudniu!");
                break;
            default:
                System.out.println("Ty kłamczuszku, nie ma takiego miesiąca w kalendarzu :)");
                break;
        }
        System.out.println("Urodziłeś się w " + miesiac);
    }
}

