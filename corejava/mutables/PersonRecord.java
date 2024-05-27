package corejava.mutables;

/**
 * It is Record. Record is a named or nominal tuple. The equivalent code would be
 * public final class Person extends Record {
 * private final String name;
 * private final String address;
 * <p>
 * public Person(String name, String address) {
 * this.name = name;
 * this.address = address;
 * }
 * <p>
 * public String name() {
 * return name;
 * }
 * <p>
 * public String address() {
 * return address;
 * }
 *
 * @param name
 * @param address
 * @Override public boolean equals() {
 * <p>
 * }
 * @Override public int hashcode() {
 * <p>
 * }
 * @Override public toString() {
 * <p>
 * }
 * <p>
 * }
 */


import corejava.abstraction.Vehicle;

import java.util.Objects;

/**
 *
 * Neither extensible not can extend, but it can implement
 * The more tempting it is to add additional methods to the basic data carrier
 * (or to make it implement an interface),
 * the more likely it is that a full class should be used rather than a record.
 */
public record PersonRecord(String name, String address) implements Vehicle {

    /**
     * can define static (final or non-final) fields
     * CANNOT DEFINE INSTANCE FIELDS IN RECORDS
     */
    public static final String TEST = "test";


    /**
     * default constructor
     */
    public PersonRecord() {
        this("Hello", "World");
    }

    /**
     * custom constructor
     * no direct assignment is allowed. Always need to delegate to the canonical constructor
     */
    public PersonRecord(String name) {
        this(name, "World");
    }

//    /**
//     * canonical constructor overriding
//     */
    public PersonRecord(String name, String address) {
       if (Objects.isNull(name)) try {
           throw new Exception("heeh");
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
        Objects.nonNull(address);
        this.name = name;
        this.address = address;
    }

    /**
     * canonical constructor overriding - parameter name must match the arguments
     * parameters cannot be named x and y
     */
//    public PersonRecord(String x, String y) {
//        this.name = x;
//        this.address = y;
//    }

//    /**
//     * compact constructor
//     * It will print null, because the assignment happens at the last
//     */
//    public PersonRecord {
//        System.out.println(name());
//        System.out.println(address());
//
//    }

    @Override
    public void move() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    /**
     * Static methods in RECORDS
     */
    public static String started() {
        return "Started";
    }

    /**
     * Non-Static methods in RECORDS
     */
    public String stopped() {
        return "Stopped";
    }

    @Override
    public void wheels() {
        Vehicle.super.wheels();
    }

    /**
     * DESERIALIZATION IN RECORDS ASSIGNS THE FIELD THROUGH CANONICAL CONSTRUCTOR.
     * DESERIALIZATION IN CLASSES ASSIGNS THE FIELD DIRECTLY.
     */


    public static void main(String[] args) {
        PersonRecord person = new PersonRecord("John", "Doe");
        System.out.println(PersonRecord.started());
        System.out.println(person.stopped());
//        PersonRecord person2 = new PersonRecord();
//        PersonRecord person3 = new PersonRecord("Beautifull");
        System.out.println(person.name());
        System.out.println(person.address());
//        System.out.println(person2.name());
//        System.out.println(person2.address());
//        System.out.println(person3.name());
//        System.out.println(person3.address());
    }

}



