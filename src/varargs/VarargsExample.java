package varargs;

public class VarargsExample {

    public static void main(String[] args) {
        new VarargsExample().printArgs(4, 6,5,7);
    }

    void printArgs(int firstArg, int... numbers) {
        System.out.println("Argument stały: " + firstArg);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Argument ze zmiennej grupy: " + numbers[i]);
        }
    }
}
