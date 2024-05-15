package corejava.designpatterns.creational.singleton;

public enum SingletonEnum {

    INSTANCE("Test");

    private String test;

    public String getTest() {
        return test;
    }

    public static void test() {

    }

    SingletonEnum(String test) {
        this.test = test;
    }


}
