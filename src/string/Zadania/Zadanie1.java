package string.Zadania;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();
        if (name.length() <= 5) {
            return;
        }

            System.out.println(name.toLowerCase());
        System.out.println(name.replace("a", "z"));
        System.out.println(name.contains("java"));
        System.out.println(name.toUpperCase());
        String text = "JAVA";
        System.out.println(name.equals(text));
    }
}
