package corejava.abstraction;

public class TestImpl extends TestAbstract {

    public TestImpl() {
        super(10);
    }

    @Override
    void test() {

    }

    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        Vehicle vehicle = new Scooter();
        // invoking default methods via implementation class

        Container container = new Container();
        System.out.println(container);
        vehicle.wheels();


        // invoking static methods only through interface
        Vehicle.repair();
        int a1 = Vehicle.a;
        Scooter b = Vehicle.b;


    }
}
