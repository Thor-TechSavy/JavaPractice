package corejava.nestedclass;

import java.util.ArrayList;

/**
 * The static inner class belongs to the outer class. It doesn't belong to the instances of the outer class;
 * We can create the instances of the inner static class. OC.innerStaticClass aClass = new OC.innerStaticClass()
 */
public class OuterClass {

    public static class staticInnerClass {
        public staticInnerClass() {

        }
    }

    public static void main(String[] args) {
        OuterClass.staticInnerClass aClass = new OuterClass.staticInnerClass();
    }
}
