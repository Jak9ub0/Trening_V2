package string.Zadania;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres domu w formacie xx/xx: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("[1-9A-Z]+\\+[1-9A-Z]");
        String matcher = text;
        System.out.println(matcher.matches(text));

}}
