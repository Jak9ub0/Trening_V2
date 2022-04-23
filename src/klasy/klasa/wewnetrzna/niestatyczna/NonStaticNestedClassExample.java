package klasy.klasa.wewnetrzna.niestatyczna;

public class NonStaticNestedClassExample {

    public static void main(String[] args) {
        OuterClass outerClassObject = new OuterClass("Costam", 23);
        OuterClass.InnerClass innerClassObject = outerClassObject. new InnerClass("sdfgsdf");
        innerClassObject.printInfo();
    }
}
