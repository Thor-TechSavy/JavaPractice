package corejava.designpatterns.creational.factory;

public class Client {

    public static void main(String[] args) {
        ProfessionFactory factory = new ProfessionFactory();

        Profession engineer = factory.getProfession("Engineer");
        Profession manager = factory.getProfession("Manager");

        engineer.sayProfession();
        manager.sayProfession();
    }
}
