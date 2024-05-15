package corejava.methodoverriding;

public class Parent {

    int rollNumber;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    private void drive() {
        int local = 2;
        System.out.println("Let's drive the parent");

        for (int i = 0; i < local; i++) {

        }
    }

    public static void ride() {
        System.out.println("Let's ride the parent");
    }

    public void occupation() {
        System.out.println("Parent Occupation");
//        test();
    }

}
