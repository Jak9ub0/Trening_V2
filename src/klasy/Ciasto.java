package klasy;

public class Ciasto {

    private int maka;
    private int cukier;
    private int woda;
    private int wagaCiasta;

    public void setMaka(int maka) {
        wagaCiasta = wagaCiasta +maka;
        this.maka = maka;
    }

    public void setCukier(int cukier) {
        wagaCiasta = wagaCiasta +cukier;

        this.cukier = cukier;
    }

    public void setWoda(int woda) {
        wagaCiasta = wagaCiasta +woda;

        this.woda = woda;
    }


    public void ileWazyCiasto(){
        System.out.println(wagaCiasta);
    }

    public void zjedzKawalek(int ilosc){
        wagaCiasta = wagaCiasta - ilosc;
    }
}
