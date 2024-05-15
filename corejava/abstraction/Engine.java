package corejava.abstraction;

public interface Engine {

    void start();

    default void wheels() {
        System.out.println("Wheels");
    }

    static void stroke() {
        System.out.println("Stroke");
    }
}
