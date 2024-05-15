package corejava.javapassbyvalue;

import corejava.methodoverriding.Child2;

public class Cage extends Object {

    static {
        System.out.println("I AM THE STATIC BLOCK");
    }

    public static void main(String[] args) {
        int i = 5;
        modify(i);
   //     System.out.println("from main method:" + i);


        Child2 child = new Child2();
        child.setX(1);
        child.setY(2);

        modifyObject(child);

        System.out.println("from main method:" + child.getX());
        System.out.println("from main method:" + child.getY());


    }

    public static void modify(int i) {
        i = i + 1;
  //      System.out.println("from modify method:" + i);
    }

    public static void modifyObject(Child2 child) {

//        child.setX(9);
//        child.setY(10);


        child = new Child2();
        child.setX(99);
        child.setY(199);

        System.out.println("x: " + child.getX());
        System.out.println("y: " + child.getY());


    }
}
