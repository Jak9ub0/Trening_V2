package tablice;

public class TabliceExeample {

    public static void main(String[] args) {
        double[] doubles = new double[4];
        double[] mojeDoubleZainicjializowane = new double[]{34d, 45d, 56d, 20432.9d};

        int length = doubles.length;

        doubles[0] = 234.2;
        doubles[1] = 25.2;
        doubles[2] = 288.2;
        doubles[3] = 22343.2;

        System.out.println(doubles[0]);
        System.out.println(doubles[1]);
        System.out.println(doubles[2]);
        System.out.println(doubles[3]);

    }
}
