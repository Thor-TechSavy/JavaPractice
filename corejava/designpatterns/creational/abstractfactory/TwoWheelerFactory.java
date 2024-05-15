package corejava.designpatterns.creational.abstractfactory;

public class TwoWheelerFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle(String name) {

        if (name.equals("Activa")) {
            return new Activa();
        }

        if (name.equals("Vespa")) {
            return new Vespa();
        }

        return null;
    }
}
