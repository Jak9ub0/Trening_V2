package klasy;

public class Car {
     String color;
     int maxSpeed;
     String brand;

    public Car() {
    }

    public Car(String color, int maxSpeed, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    public Car(int maxSpeed, String color,  String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }



    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", color, maxSpeed, brand));
    }
}
