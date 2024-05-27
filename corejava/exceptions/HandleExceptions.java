package corejava.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Checked exceptions - FileNotFoundException, SqlDataException
 * Unchecked Exceptions - NullPointerException, ArithmeticException, ArrayIndexOutOfBoundException
 * Error - StackOverFlowError, AssertionError
 */
public class HandleExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("hello");
            throw new RuntimeException("hello");
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("finally");
        }
    }

    public int test() {

        System.out.println("test");
        return 1 / 0;
    }

    public int test2() throws FileNotFoundException {
        System.out.println("test2");
        return 1 / 0;
    }

    public int test3() {
        System.out.println("test2");
        return 0;
    }

    /**
     * Checked exceptions cannot be propagated without declaring them. Will get compile time error
     * @return
     * @throws IOException
     */
    public int test4() throws IOException {

        try {
            System.out.println("test");
            throw new FileNotFoundException();
        } catch (Exception e) {
            throw new IOException();
        }
    }

}
