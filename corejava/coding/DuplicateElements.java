package corejava.coding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 5, 5, 2, 7, 10, 9, 10);
        duplicateElements(integers);
        groupByDuplicate(integers);
    }

    private static void duplicateElements(List<Integer> integers) {
        final Set<Integer> unique = new HashSet<>();
        integers.stream().filter(integer -> !unique.add(integer)).collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    private static void groupByDuplicate(List<Integer> integers) {
        integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
