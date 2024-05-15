package corejava.serialization;

import java.io.*;

public class ExternalizationExample implements Externalizable {

    @Serial
    private static final long serialVersionUID = 1L;

    //    private transient int age; - DOESN'T applicable to EXTERNALISATION
    private int age;
    private String firstName;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Mandatory no-arg constructor for Externalisation
     */
    public ExternalizationExample() {
    }

    public ExternalizationExample(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
        out.writeObject(firstName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.age = in.readInt();
        this.firstName = (String) in.readObject();
    }

    Object readResolve() throws ObjectStreamException {
        return new ExternalizationExample(27, "SUPER");
    }
}
