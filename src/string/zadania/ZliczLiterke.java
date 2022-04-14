package string.zadania;
/*
Napisać program, który wczytuje od użytkownika ciąg znaków,
a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
Przykład, dla ciągu „Abrakadabra" program powinien wyświetlić 4, ponieważ ostatnim znakiem jest literka „a",
która występuje w podanym ciągu łącznie 4 razy.
 */

import java.util.Scanner;

public class ZliczLiterke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String text = scanner.nextLine();
        char lastCharacter = text.charAt(text.length() - 1);
        int counter = 0;
        for (char character : text.toCharArray()) {
            if (character == lastCharacter) {
                counter++;
            }
        }
        System.out.println("Ostatni znak: " + lastCharacter);
        System.out.println("Liczba wystąpień: " + counter);
    }
}
