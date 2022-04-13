package klasy;

public class CarDealerMain {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();
        Car car = new Car();
        Car car1 = new Car();
        dealer.addCar(car);
        dealer.addCar(car1);
        dealer.printCarsAmount();
    }


}
