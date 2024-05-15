package corejava.designpatterns.creational.singleton;


/**
 * If implements Serializable, the deserialization can result into another object, so good to
 * mark the instance variables as transient. Also create Object readResolve() to return the instance,
 * and the other newly created instance will be garbage collected.
 */
public final class PublicConstructor {

    private static final PublicConstructor instance = new PublicConstructor();

    private PublicConstructor() {
    }

    /**
     * not thread safe. to make them thread safe, use synchronised
     */
    public static PublicConstructor getInstance() {
        return instance;
    }
}
