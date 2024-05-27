package corejava;

public class Testing {

    public static void main(String[] args) {
        String a = "test";
        String d = "test";
        String b = a + "ing";  // --> heap --> new String("ing") and also in pool
        String c = "testing";
        b = b.intern();

        String e = "ing";

        String k = new String("Shivam");
    //    k = k.intern();
        String l = "Shivam";
        System.out.println(k == l);


        System.out.println("Comparing a & d: should be in const pool " + (a == d));
        System.out.println("Comparing b & c: should be in heap & const pool " + (b == c));

    }
}
