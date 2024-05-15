package corejava.concurrency;

public class Deadlock2 {

    private final static Integer CONSTANT = 5;
    private int a;

    public static void main(String[] args) throws InterruptedException {
        Deadlock2 obj = new Deadlock2();
        Thread t = new Thread(obj::test);
        t.run();
        t.start();
        t.notify();



    }

    void test() {
        synchronized (this) {
            System.out.println("print");
            test();
        }
    }

}
