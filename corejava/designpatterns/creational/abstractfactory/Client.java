package corejava.designpatterns.creational.abstractfactory;

public class Client {

    // factory of factories
    public static void main(String[] args) {
        VehicleAbstractFactory abstractFactory = new VehicleAbstractFactory();

        VehicleFactory fourWheelerFactory = abstractFactory.getVehicle("FourWheelerFactory");
        VehicleFactory twoWheelerFactory = abstractFactory.getVehicle("TwoWheelerFactory");

        Vehicle activa = twoWheelerFactory.createVehicle("Activa");
        activa.name();

        Vehicle lancer = fourWheelerFactory.createVehicle("Lancer");
        lancer.name();


    }
}
