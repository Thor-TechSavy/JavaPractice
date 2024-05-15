package corejava.designpatterns.creational.abstractfactory2;

public class FoodFactory extends Factory {
    @Override
    public void name() {
        System.out.println("Food Factory");
    }

    public Food getFood(String name) {
        if (name.equals("Burger")) {
            return new Burger();
        }
        return null;
    }
}
