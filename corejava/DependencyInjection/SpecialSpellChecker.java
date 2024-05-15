package corejava.DependencyInjection;

import java.util.*;

public class SpecialSpellChecker implements SpellChecker {

    public static void main(String [] args) {

        Map<String, Toy> toyMap = new WeakHashMap<>();

        Toy teddy = new Toy("Hello");

        toyMap.put("hello", teddy);

        teddy.play();

        System.out.println(toyMap.get("hello"));
    }

}
