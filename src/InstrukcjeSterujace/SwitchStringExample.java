package InstrukcjeSterujace;

import java.util.Scanner;

public class SwitchStringExample {
    public static void main(String[] args) {
        System.out.println("podaj miasto a podamy wojewodztwo");
        Scanner scanner = new Scanner(System.in);
        String miasto = scanner.next();
        switch (miasto){
            case "warszawa": System.out.println("Mazowieckie");
            break;
            case "czestochowa": System.out.println("slaskie");
            break;
            case "kielce": System.out.println("swietokrzyskie");
            break;
            default:
                System.out.println("polska");
                break;
        }
    }
}
