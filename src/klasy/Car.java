package klasy;

public class Car {
    protected String color;
    private int maxSpeed;
    private String brand;

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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", color, maxSpeed, brand));
    }
}
