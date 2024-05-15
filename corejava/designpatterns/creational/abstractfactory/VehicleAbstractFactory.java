package corejava.designpatterns.creational.abstractfactory;

public class VehicleAbstractFactory {

    // factory of factories

    public VehicleFactory getVehicle(String factory) {
        if (factory.equals("TwoWheelerFactory")) {
            return new TwoWheelerFactory();
        }

        if (factory.equals("FourWheelerFactory")) {
            return new FourWheelerFactory();
        }

        return null;
    }


}
