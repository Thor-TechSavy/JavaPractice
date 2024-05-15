package corejava.DependencyInjection;

public interface SpellChecker {

    //static methods cannot be overridden
    static boolean isValid() {
        return true;
    }
}
