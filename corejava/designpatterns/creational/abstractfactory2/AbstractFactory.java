package corejava.designpatterns.creational.abstractfactory2;

public final class AbstractFactory {

    private AbstractFactory() {
    }

    public static Factory getFactory(final FactoryType factoryType) {
        if (factoryType == FactoryType.ELECTRONICS) {
            return new ElectronicsFactory();
        }

        if (factoryType == FactoryType.MEDICINE) {
            return new MedicalFactory();
        }

        if (factoryType == FactoryType.FOOD) {
            return new FoodFactory();
        }
        throw new RuntimeException("No such factory type");
    }
}
