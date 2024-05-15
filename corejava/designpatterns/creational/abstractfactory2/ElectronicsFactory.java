package corejava.designpatterns.creational.abstractfactory2;

public class ElectronicsFactory extends Factory {
    @Override
    public void name() {
        System.out.println("Electronics Factory");
    }
}
