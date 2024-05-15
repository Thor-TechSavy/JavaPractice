package corejava.coding;

import java.util.List;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(checkPrime(5));
    }

    private static boolean checkPrime(final int number) {

        return number > 1 && IntStream.range(2, number).noneMatch(value -> number % value == 0);
    }

    private static void sqRtOfNPrimeNumber(final int n) {

        List<Double> list = Stream.iterate(1, i -> i + 1)
                .filter(PrimeNumber::checkPrime)
                .map(Math::sqrt)
                .limit(n)
                .toList();

        System.out.println(list);
    }
}
