package klasy;

public class CarDealer {

    Car[] cars = new Car[10];
    int carsAmount = 0;
    String dealerName;

    public void addCar(Car car){
        cars[carsAmount] = car;
        carsAmount++;
    }

    public void printCarsAmount(){
        System.out.println("Cars amount: "+ cars);
    }
}
