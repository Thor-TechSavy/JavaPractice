package corejava.methodoverriding;

public class Monkey extends Animal {

    @Override
    public void eat() {
        System.out.println("Monkey eats");
    }

    public static void sleep() {
        System.out.println("Monkey sleeps");
    }

    public static void main(String[] args) {
        Animal animal = new Monkey();
        Monkey monkey = new Monkey();
        animal.sleep();
        monkey.sleep();
    }
}
