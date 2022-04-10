package tablice;

public class TabliceWielowymiaroweExample2 {

    public static void main(String[] args) {
        int[][] tab = new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println("");
        }
    }
}
