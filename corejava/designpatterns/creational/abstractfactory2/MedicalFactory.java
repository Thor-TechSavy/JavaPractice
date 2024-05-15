package corejava.designpatterns.creational.abstractfactory2;

public class MedicalFactory extends Factory{
    @Override
    public void name() {
        System.out.println("Medical Factory");
    }
}
