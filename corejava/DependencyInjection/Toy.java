package corejava.DependencyInjection;

public class Toy {

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void play() {
        System.out.println("played");
    }
}
