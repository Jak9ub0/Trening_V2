package klasy;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car();
//        Car car2 = new Car("Red", 234, "Fiat");
//        Car car3 = new Car( 234,"skndfjsog", "Fiat");

//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car1.getColor(), car1.getMaxSpeed(), car1.getBrand()));
//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car2.color, car2.maxSpeed, car2.brand));
//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car3.color, car3.maxSpeed, car3.brand));

//        System.out.println("");
//        car1.printCarParameters();
        car1.setBrand("opel");
//        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", car1.getColor(), car1.getMaxSpeed(), car1.getBrand()));

        car1.printCarParameters();
//        car2.printCarParameters();
//        car3.printCarParameters();
    }
}
