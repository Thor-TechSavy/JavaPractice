package corejava.abstraction;

public class Client {

    public static void main(String[] args) {
//        adhering to abstraction
        Vehicle vehicle = new Car();

        Vehicle vehicle1 = new Scooter();

        Vehicle vehicle2 = new Cycle();


//        violation of abstraction
        Car car = new Car();
        car.move();


        vehicle.move();
    }
}
