package wyjatki;

import java.util.InputMismatchException;

public class WyjatkiExample {

    public static void main(String[] args) {
        int[] tab = new int[]{1,3,5};
        try {
            System.out.println(tab[5]);
            System.out.println("jakis kod");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("polecial wyjatek przekroczony zakres tablicy");
        } catch (RuntimeException e){
            System.out.println("polecial wyjatek");
        }
        System.out.println("kod po wyjatku");


//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }


}
