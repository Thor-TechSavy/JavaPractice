package corejava.designpatterns.creational.prototype;

public abstract class Space implements Cloneable {
    private int id;

    protected Space(int id) {
        this.id = id;
    }

    public Space clone() throws CloneNotSupportedException {
        return (Space) super.clone();
    }

    /**
     * copy constructor
     *
     * @param other
     */
    protected Space(Space other) {
        this(other.id);
        System.out.println("I am a Space constructor");
    }
}
