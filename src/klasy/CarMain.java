package klasy;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMaxSpeed(280);
        car1.setProductionYear(1999);
        car1.setZezlomowanieYear(2010);
//        Car car2 = new Car("Red", 234, "Fiat");
//        Car car3 = new Car( 234,"skndfjsog", "Fiat");

//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car1.getColor(), car1.getMaxSpeed(), car1.getBrand()));
//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car2.color, car2.maxSpeed, car2.brand));
//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car3.color, car3.maxSpeed, car3.brand));

//        System.out.println("");
//        car1.printCarParameters();
        car1.setBrand("opel");
//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car1.getColor(), car1.getMaxSpeed(), car1.getBrand()));
int i =2342;
//        car1.printCarParameters();
        System.out.println(car1);
        car1.checkIfSpeedIsLimited(200);
        System.out.println(car1.getAgeAtZlomowanie());
        Scanner scanner = new Scanner(System.in);
        String kolor=scanner.next();
        car1.setColor(kolor);
//        car2.printCarParameters();
//        car3.printCarParameters();
    }
}
