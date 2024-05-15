package corejava.designpatterns.creational.abstractfactory2;

public class Client {

    public static void main(String[] args) {

        Factory electronicsFactory = AbstractFactory.getFactory(FactoryType.ELECTRONICS);
        FoodFactory foodFactory = (FoodFactory) AbstractFactory.getFactory(FactoryType.FOOD);
        Factory medicalFactory = AbstractFactory.getFactory(FactoryType.MEDICINE);

        electronicsFactory.name();
        Food burger = foodFactory.getFood("Burger");
        System.out.println(burger.getName());
        medicalFactory.name();
    }
}
