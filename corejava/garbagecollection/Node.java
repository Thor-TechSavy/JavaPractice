package corejava.garbagecollection;

public class Node {

    private Node prev;
    private Node next;

    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();

        node1.next = node2;
        node2.prev = node1;

        node1 = null;
        node2 = null;

        Runtime.getRuntime().gc();

    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Finalizer is called");
        super.finalize();

    }
}
