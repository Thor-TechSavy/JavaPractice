package corejava.functional;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Functional interfaces can be Comparator, Runnable
 */
public class Functions {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(1, 1);


        Comparator<Integer> comparator = Integer::compareTo;
        Comparator<Integer> comparator1 = (a, b) -> Integer.compare(a, b);

        Function<String, String> function = String::toUpperCase;
        int compare = comparator.compare(20, 10);
        System.out.println(compare);
    }
}
