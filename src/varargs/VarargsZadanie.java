package varargs;

import java.util.Arrays;
import java.util.Iterator;

/*
Zadanie: Stworzcie metode  grupa parametrow typu string,
 nastepnie metoda ma printoweac konkatencaje slow przekazanych parametrem grupowym
 */
public class VarargsZadanie {

    public static void main(String[] args) {
        new VarargsZadanie().wypluj2("maslo", "bulka","kwiatek","zupka");
    }

    void wypluj(String... numbers) {

        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }

    void wypluj2(String... numbers) {
        Iterator<String> it = Arrays.stream(numbers).iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}

