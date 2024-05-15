//package corejava.methodoverriding;
//
//import javax.naming.directory.SearchControls;
//
//public class Child extends Parent {
//
//    int i;
//    int j;
//    int k;
//    int l;
//
//    //no arg constructor
//    Child() {
//
//    }
//
//    // Creates new object as copy of another object. Eventually, there will be two objects
//
//    Child(Child2 child2) {
//        this.i = child2.x;
//        this.j = child2.y;
//    }
//
//
//    // constructor calling another constructor to delegate the part of object initialisation
//    Child(int i, int j, int k, int l) {
//
//        this(k, l);
//        this.i = i;
//        this.j = j;
//    }
//
//    Child(int k, int l) {
//
//    }
//
//
// //   @Override
//    public void drive() {
//        System.out.println("Child drive");
//    }
//
//    public static void ride() {
//        System.out.println("Child ride");
//    }
//
//    @Override
//    public void occupation() {
//        System.out.println("Child occupation");
//    }
//
//    public static void main(String[] args) {
//
//        final Parent p = new Parent();
//        p.setName("Shivam");
//
//        p = new Child();
//
//
//
//
//
//
//
//
//
//        try {
//            Child c = new Child(); // memory allocate; object create; object initialise. // allow to play with object even before creating the object
//            Child.ride();
//        //    System.exit(0);
//        } catch (Exception e) {
//            //
//        } finally {
//            System.out.println("I am executed");
//        }
//    }
//
//
//
//}
