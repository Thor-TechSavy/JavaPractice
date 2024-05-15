package corejava.functional;

import java.util.ArrayList;
import java.util.List;

/**
 * Collectors - toMap, toSet, toList, joining, counting, groupingBy, PartitioningBy, averagingDouble(int, long), summarizing (double, int, long)
 * StreamBuilder - accept, add, build
 * StreamSupport - Int Stream, Long Stream, Double Stream
 * Terminal operations - toArray, min, max, count, collect, findFirst, findAny, anyMatch, forEach, reduce
 * Intermediate operations - sorted, map, filter, limit, peek, distinct, skip
 * Short-circuit operations - Terminal - anyMatch, allMatch, nonMatch, findFirst, findAny
 * - Intermediate - limit
 * <p>
 * Intermediate operations - Results into a new stream
 * Terminal operations - results into primitive, collection, objects or nothing. Intermediate operations won't do anything unless you invoke terminal operation on it.
 */
public class Streams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.stream()
                .filter(str -> str.length() > 3)
                .peek(System.out::println) //peek is an intermediate operation. It takes consumer. Returns stream of original elements.
                .reduce((s, s2) -> s + s2)
                .get();
    }
}
