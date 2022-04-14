package string;

public class StringExample extends Object{

    public static void main(String[] args) {
        String text1 = "Jakis tekst";
        String text2 = "jakis tekst";

        System.out.println(text1.equalsIgnoreCase(text2));


        StringBuilder napis = new StringBuilder("Poczatek ");
        for (int i=0; i<10; i++){
            napis.append("to ");
        }
        System.out.println(napis);
    }
}
