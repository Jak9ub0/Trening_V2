package varargs;

/*
Zadanie: Stworzcie metode  grupa parametrow typu string,
 nastepnie metoda ma printoweac konkatencaje slow przekazanych parametrem grupowym
 */
public class VarargsZadanie {

    public static void main(String[] args) {
        new VarargsZadanie().wypluj("maslo", "bulka","kwiatek","zupka");
    }

    void wypluj(String... numbers) {
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }}

