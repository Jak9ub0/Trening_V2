package klasy.klasa.wewnetrzna;

public class Telefon {
    private String firma;
    private String model;
    private int iloscAparatow;

    public Telefon(String firma, String model, int iloscAparatow) {
        this.firma = firma;
        this.model = model;
        this.iloscAparatow = iloscAparatow;
    }

    public class Wyswietlacz{
        private double przekatna;
        private int iloscKolorow;

        public Wyswietlacz(double przekatna, int iloscKolorow) {
            this.przekatna = przekatna;
            this.iloscKolorow = iloscKolorow;
        }

        public void wydrkujInfo(){
            System.out.println(firma+ " " + model+ " " +iloscAparatow+ " " + przekatna+ " " + iloscKolorow);
        }
    }



}
