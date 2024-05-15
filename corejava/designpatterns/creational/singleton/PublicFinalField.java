package corejava.designpatterns.creational.singleton;

public class PublicFinalField {

    public static final PublicFinalField INSTANCE = new PublicFinalField();

    private PublicFinalField() {}

}
