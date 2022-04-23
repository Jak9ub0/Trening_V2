package klasy.zadania;

/*
Zadanie: Napiszcie klase Szkola ktora ma pole nazwa oraz tablice uczniow,
 klasa uczen jest zagniezdzona klasa niestatyczna. klasa szkola ma
  metode ktora ma informowac ile uczniow poasiada szkola.
  W klasie SzkolaMain utworzcie instancje szkoly oraz tablice uczniow ktora dodacie do instancji szkola
 */

public class SzkolaMain{

    public static void main(String[] args) {

        Szkola szkola = new Szkola();
        Szkola.Uczen uczen1 = szkola.new Uczen("sfs", "sefgsg", 4);
        Szkola.Uczen uczen2 = szkola.new Uczen("sdgs", "sdsd", 7);
        Szkola.Uczen[] tab = new Szkola.Uczen[]{uczen1, uczen2};
        szkola.setNazwa("Liceum");
        szkola.setTablica(tab);
        System.out.println(szkola.ileUczniow());
    }
        }
