package klasy.zadania;

public class Szkola {

    private String nazwa;
    private Uczen[] tablica;

    public int ileUczniow(){

        return tablica.length;
    }

    public String getNazwa() {

        return nazwa;
    }

    public void setNazwa(String nazwa) {

        this.nazwa = nazwa;
    }

    public Uczen[] getTablica() {

        return tablica;
    }

    public void setTablica(Uczen[] tablica) {

        this.tablica = tablica;
    }

    public class Uczen{
        private String imie;
        private String naziwsko;
        private int klasa;

        public Uczen(String imie, String naziwsko, int klasa) {
            this.imie = imie;
            this.naziwsko = naziwsko;
            this.klasa = klasa;
        }
    }

}
