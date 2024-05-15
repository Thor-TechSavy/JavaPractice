//package corejava.exceptions;
//
//import java.io.FileNotFoundException;
//import java.sql.SQLException;
//
//public class Subclass extends HandleExceptions {
//
//    /*
//    so if the parent class throws an unchecked exception, then in the child class if you override the
//    method, then you can use any unchecked exception and not checked exception
//     */
//    @Override
//    public int test() {
//        System.out.println("I am child test method");
//        try {
//            return 1/0;
//        } catch (FileNotFoundException e) {
//            System.out.println("Arithmetic exception");
//        }
//        return 0;
//    }
//
//    /**
//     * So if the parent class method declares or throws an exception, the overridden child class method
//     * can declare or throws same or any subclass exception but no superclass exception or cannot 'throws' anything
//     * @return
//     * @throws NullPointerException
//     */
//
//    @Override
//    public int test2() throws NullPointerException {
//        System.out.println("I am child test method");
//        return 0;
//    }
//
//    /**
//     * If the parent class method doesn't declare or throws anything, the child class overridden method can declare or throws
//     * only unchecked exceptions
//     *
//     * @return
//     * @throws NullPointerException
//     */
//    @Override
//    public int test3() throws NullPointerException {
//        System.out.println("I am child test method");
//        return 0;
//    }
//
//}
