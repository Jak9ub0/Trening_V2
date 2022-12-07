package dataczas;

public class Vargas {
    public static void main(String[] args) {
new Vargas().printArgs("maciek","ma","Fajnego","Kota");
    }

    void printArgs(String firstArg, String... numbers) {
        System.out.println("Argument stały: " + firstArg);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Argument ze zmiennej grupy: " + numbers[i]);
            //System.out.print(firstArg+" "+ numbers[i]);
        }
    }
}
