package corejava.nestedclass;

/**
 * The static inner class belongs to the outer class. It doesn't belong to the instances of the outer class;
 * We can create the instances of the inner static class. OC.innerStaticClass aClass = new OC.innerStaticClass()
 */
public class OuterClass {

    public static class StaticInnerClass {
        public StaticInnerClass() {

        }
    }

    public static void main(String[] args) {
      new OuterClass.StaticInnerClass();
    }
}
