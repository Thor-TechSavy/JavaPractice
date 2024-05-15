package corejava.abstraction;

import java.security.PrivateKey;

public class Cycle extends HelloAbstract implements Vehicle {


    @Override
    public void move() {
        System.out.println("Cycle moving");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {
    }

    @Override
    public void wheels() {
    //    Vehicle.super.wheels();
    }

    @Override
    void test() {

    }
}
