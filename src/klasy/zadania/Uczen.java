package klasy.zadania;

public class Uczen {
    private String imie;
    private String nazwisko;
    private String klasa;

    public Uczen(String imie, String nazwisko, String klasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }
}
