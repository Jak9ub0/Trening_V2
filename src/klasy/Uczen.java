package klasy;

public class Uczen {

    private String imie;
    private String nazwisko;
    private int klasa;

    public Uczen(String imie, String nazwisko, int klasa) {
        this(imie, nazwisko);
        this.klasa = klasa;
    }

    public Uczen(String imie, String nazwisko) {
        this(imie);
        this.nazwisko = nazwisko;
    }

    public Uczen(String imie) {
        this.imie = imie;
    }

}
