package corejava.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Buffer {

    private List<Integer> integers;
    private final int maxSize;

    public Buffer(int maxSize) {
        this.maxSize = maxSize;
        integers = new ArrayList<>();
    }

    public synchronized void addItem(Integer num) throws InterruptedException {
        while (integers.size() >= maxSize) {
            wait();
        }
        integers.add(num);
        notifyAll();
    }

    public synchronized void removeItem() throws InterruptedException {
        while (integers.isEmpty()) {
            wait();
        }
        integers.remove(integers.size() - 1);
        notifyAll();
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.addItem(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                buffer.removeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
