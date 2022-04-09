package InstrukcjeSterujace;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {
        System.out.println("Podaj swoja temperature");

        Scanner scanner = new Scanner(System.in);
        float temperature = scanner.nextFloat();

        if (temperature >= 37.0f) {
            System.out.println("Masz gorączkę/stan podgorączkowy!");
        } else if (temperature > 40) {
            System.out.println("Jesteś zdrowa/zdrowy!");
        } else{
            System.out.println("Jesteś osłabiona/osłabiony!");
        }
        System.out.println("Dalsza czesc kodu");

    }
}
