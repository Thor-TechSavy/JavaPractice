package corejava.nestedclass;


/**
 * The member inner class or non-static inner class. We need outer class instance to create instance of
 * the non-static inner class;
 */
public class OuterClass2 {

  private class InnerClass {

  }

    public static void main(String[] args) {
        OuterClass2 oc = new OuterClass2();

        InnerClass innerClass = oc.new InnerClass();

    }
}
