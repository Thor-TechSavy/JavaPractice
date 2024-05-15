package corejava.serialization;

import java.io.*;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializationExample se = new SerializationExample(18, "Tars");
        System.out.println("Original data:" + se.getAge() + " " + se.getName());


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("corejava/file.txt"));
        oos.writeObject(se);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("corejava/file.txt"));
        SerializationExample o = (SerializationExample) ois.readObject();
        ois.close();
        System.out.println("Deserialized data:" + o.getAge() + " " + o.getName());

//        ExternalizationExample ee = new ExternalizationExample(18, "Spider");
//
//        System.out.println("Original data:" + ee.getAge() + " " + ee.getFirstName());
//
//        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("corejava/file2.txt"));
//        oos2.writeObject(ee);
//        oos2.close();
//
//        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("corejava/file2.txt"));
//        ExternalizationExample o2 = (ExternalizationExample) ois2.readObject();
//        ois2.close();
//
//        System.out.println("Deserialized data:" + o2.getAge() + " " + o2.getFirstName());



    }
}
