package corejava.abstraction;

public class Container {

    protected Container() {
        System.out.println("Container");
    }


    public String name() {
        return "Container";
    }

    public Integer name(Integer i) {
        return i;
    }
}
