package corejava.abstraction;

public class Car implements Vehicle {

    public Integer acceleration;

    @Override
    public void move() {
        System.out.println("Moving the Car");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
