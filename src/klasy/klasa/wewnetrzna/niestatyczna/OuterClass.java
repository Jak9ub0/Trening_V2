package klasy.klasa.wewnetrzna.niestatyczna;

public class OuterClass {

    private String nazwa;
    private int liczba;

    public OuterClass(String nazwa, int liczba) {
        this.nazwa = nazwa;
        this.liczba = liczba;
    }

    public class InnerClass{
        private String jakiesPole;

        public InnerClass(String jakiesPole) {
            this.jakiesPole = jakiesPole;
        }

        public void printInfo(){
            System.out.println(String.format("info o tej klasie %s %d %s", nazwa, liczba, jakiesPole));
        }
    }
}
