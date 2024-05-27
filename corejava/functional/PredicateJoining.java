package corejava.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() > 5;
        Predicate<String> checkStartingWith = s -> s.startsWith("a");
        Predicate<String> checkEndingWith = s -> s.endsWith("e");

        Function<Integer, Integer> addFunction = a -> a + 5;
        Function<Integer, Integer> prodFunction = a -> a * 5;
        Function<Integer, Integer> substractFunction = a -> a - 5;

        System.out.println(checkLength.negate().or(checkStartingWith).or(checkEndingWith).test("k"));
        System.out.println(addFunction.apply(2));
        System.out.println(addFunction.andThen(prodFunction).apply(2));
        System.out.println(addFunction.compose(prodFunction).andThen(substractFunction).apply(2));


//        COLLECTIONS VS COLLECTORS


    }
}
