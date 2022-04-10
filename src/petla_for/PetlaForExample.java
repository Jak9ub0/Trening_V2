package petla_for;

public class PetlaForExample {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i + " Hello world");
        }
        System.out.println(i);

        String[] tablica = {"Ala", "Ma", "Kota"};

        for (String temp : tablica) {
            System.out.print(temp + " " +i );
        }
    }
}
