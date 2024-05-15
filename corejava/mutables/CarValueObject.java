package corejava.mutables;

/**
 * ValueObjects are immutable. It encapsulates set of the related attributes or values.
 * They must have equals and hashcode implementation.
 * Two Value objects must be equal if there content are same, even if they are pointed to the different instances.
 */
public class CarValueObject {

    private final String engine;

    public CarValueObject(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "CarValueObject [engine=" + engine + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CarValueObject) {
            CarValueObject other = (CarValueObject) obj;
            return this.engine.equals(other.engine);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.engine.hashCode();
    }

    public static void main(String[] args) {
        CarValueObject  carValueObject = new CarValueObject("hello");

    }
}
