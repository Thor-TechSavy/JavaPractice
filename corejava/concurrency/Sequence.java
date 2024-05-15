package corejava.concurrency;

public class Sequence {

    private Integer maxNumber;
    private volatile Integer currentNumber = 1;

    public Sequence(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void printNumbers(Integer threadNumber) throws InterruptedException {

        while (true) {
            synchronized (this) {
                if (currentNumber > maxNumber) {
                    return;
                }
                if ((currentNumber - 1) % 2 == threadNumber - 1) {
                    System.out.println(Thread.currentThread().getName() + " : " + currentNumber++);
                    notifyAll();
                }
               else {
                   wait();
                }
            }
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Thread t1 = new Thread(() -> {
            try {
                sequence.printNumbers(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                sequence.printNumbers(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
//        Thread t3 = new Thread(() -> {
//            try {
//                sequence.printNumbers(3);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
        t1.start();
        t2.start();
//        t3.start();

    }
}


//T1 1
//T2 2
//...