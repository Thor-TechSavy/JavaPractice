package corejava.designpatterns.creational.abstractfactory;

public class FourWheelerFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle(String name) {

        if (name.equals("Lancer")) {
            return new Lancer();
        }
        if (name.equals("Swift")) {
            return new Swift();
        }
        return null;
    }
}
