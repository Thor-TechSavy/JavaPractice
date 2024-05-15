package corejava.serialization;

import java.io.Serial;
import java.io.Serializable;

public class SerializationExample implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static int age;
    private final String name;

    public SerializationExample(final int age, final String name) {
        SerializationExample.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
//
//    Object readResolve() {
//        return new SerializationExample(25, "ZEUS");
//    }

}
