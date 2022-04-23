package klasy.klasa.wewnetrzna.statyczna;

import org.w3c.dom.ls.LSOutput;

public class OuterClass {

    private String nazwa;
    private int liczba;

    public OuterClass(String nazwa, int liczba) {
        this.nazwa = nazwa;
        this.liczba = liczba;
    }

    public static class InnerClass{
        private String jakiesPole;

        public InnerClass(String jakiesPole) {
            this.jakiesPole = jakiesPole;
        }


    }
}
