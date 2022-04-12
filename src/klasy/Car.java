package klasy;

public class Car {
    protected String color;
    private int maxSpeed;
    private String brand;
    private int productionYear;
    private int zezlomowanieYear;

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
    }

    public int getAgeAtZlomowanie(){
        return zezlomowanieYear - productionYear;
    }
}
