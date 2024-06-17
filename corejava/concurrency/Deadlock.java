package corejava.concurrency;

/**
 * When two or more threads are in a blocked state, each wait for the resource held by the other.
 * When two threads are waiting for each other to release the lock on the shared resources
 *
 * Live-lock - When two threads wait for sometime for each other to acquire lock and then stop trying and after sometime they will try again
 * Lock Interface - trylock(), trylock(time), lockInterruptibly, lock, unlock
 *
 */
public class Deadlock {

    final static Integer i = 1;
    final static Integer j = 2;

    static ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
//            integerThreadLocal.set(5);
//            System.out.println("Inside thread 1: " + integerThreadLocal.get());
            synchronized (i) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException ex) {
//                    System.out.println("Exception");
//                }
                System.out.println("hellow thread 1");
                synchronized (j) {
                    System.out.println("I am deadlock");
                }
            }
        });

        Thread t2 = new Thread(() -> {
//            integerThreadLocal.set(15);
//            System.out.println("Inside thread 2: " + integerThreadLocal.get());

            synchronized (j) {
                System.out.println("hello thread 2");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    System.out.println("Exception");
//                }
                synchronized (i) {
                    System.out.println("I am deadlock");
                }
            }
        });

        t1.start();
        t2.start();
    }

}