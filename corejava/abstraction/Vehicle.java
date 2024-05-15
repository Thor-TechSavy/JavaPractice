package corejava.abstraction;

public interface Vehicle {
// NOT allowed
//    static {
//        System.out.println("Inside static block");
//    }

    // the member primitives are always public final static by default
    int a = 1;

    // the object references are always public final static
    Scooter b = new Scooter();

    void move();

    void start();

    void stop();

    default void wheels() {
        System.out.println("Wheels");
    }

    static void repair() {
        System.out.println("Repair");
    }

    private void hello() {

    }
}
