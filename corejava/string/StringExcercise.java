package corejava.string;

public class StringExcercise {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        s1 = s1.intern();

        System.out.println(s1);
    }


}
