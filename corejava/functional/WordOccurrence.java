package corejava.functional;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrence {

    public static void main(String[] args) {
        String sentence = "This is a sentence is a";

        List<Integer> integers = List.of(10, 28, 87, 10, 20, 76, 28, 80);

//      normal word count
        Map<String, Long> collect = Arrays
                .stream(sentence.split(" "))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);

        // find duplicates
        List<Integer> collect1 = integers.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() >= 2).map(Map.Entry::getKey).toList();
        System.out.println(collect1);

        // find duplicates - short method
        Set<Integer> integers1 = new HashSet<>();
        List<Integer> collect2 = integers.stream().filter(i -> !integers1.add(i)).toList();
        System.out.println(collect2);

        Multiply function = (x, y) -> x * y;

        System.out.println(function.multiply(2, 5));
    }
}
