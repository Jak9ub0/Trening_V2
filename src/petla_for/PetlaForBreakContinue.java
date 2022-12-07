package petla_for;

public class PetlaForBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i=i+2) {
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
    }
}
