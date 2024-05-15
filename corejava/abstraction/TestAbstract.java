package corejava.abstraction;

public abstract class TestAbstract {

    int a;

    TestAbstract() {

    }

    TestAbstract(int a) {
        this.a = a;
    }

    abstract void test();

    public static void engine() {
        System.out.println("Engine");
    }

    public void gear() {
        System.out.println("Gear");
    }
 }
