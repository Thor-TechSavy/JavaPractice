package corejava.designpatterns.creational.factory;

/**
 * Design patterns are used to solve specific problems
 * programming language neutral
 */
public class ProfessionFactory {

    public Profession getProfession(String name) {
        if (name.equals("Engineer")) {
            return new EngineerProfession();
        }

        if (name.equals("Manager")) {
            return new ManagerProfession();
        }
        return null;
    }
}
