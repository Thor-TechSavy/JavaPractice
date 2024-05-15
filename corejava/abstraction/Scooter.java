package corejava.abstraction;

public class Scooter implements Vehicle, Engine {
    @Override
    public void move() {
        System.out.println("Scooter moving");
    }

    @Override
    public void start() {

    }

    public void start(String name) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void wheels() {
        Engine.super.wheels();
    }
}
