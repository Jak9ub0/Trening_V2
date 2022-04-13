package klasy;

public class Car {

    protected String color;
    private int maxSpeed;
    private String brand;
    private int productionYear;
    private int zezlomowanieYear;

    public Car() {
    }

    public Car(String color, int maxSpeed, String brand, int productionYear, int zezlomowanieYear) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.productionYear = productionYear;
        this.zezlomowanieYear = zezlomowanieYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getZezlomowanieYear() {
        return zezlomowanieYear;
    }

    public void setZezlomowanieYear(int zezlomowanieYear) {
        this.zezlomowanieYear = zezlomowanieYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void checkIfSpeedIsLimited(int maxSpeed){
        if(this.maxSpeed> maxSpeed){
            System.out.println("Samochod osiaga niedopuszczalna predkosc");
        }
        print("fwefwefwefwe");
    }

    public int getAgeAtZlomowanie(){

        print("kmkmkm");
        return zezlomowanieYear - productionYear;
    }
    public void print(String napis){
        System.out.println(napis);
        System.out.println(napis);
        System.out.println(napis);
    }

}
