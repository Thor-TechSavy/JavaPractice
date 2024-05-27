package corejava.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Player {

    private final String name;
    private final Integer salary;

    public Integer getAge() {
        return age;
    }

    private final Integer age;

    public Player(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {


        Player p1 = new Player("John Doe", 500, 18);
        Player p2 = new Player("Peter", 1500, 23);
        Player p3 = new Player("Antony", 2500, 27);
        Player p4 = new Player("Jack", 3500, 28);
        Player p5 = new Player("Tom", 50, 17);
        Player p6 = new Player("Harry", 42500, 36);

        Stream.of(p1, p2, p3, p4, p5, p6)
                .max(playerAgeComparator)
                .ifPresent(System.out::println);

        Stream.of(p1, p2, p3, p4, p5, p6)
                .min(playerAgeComparator)
                .ifPresent(System.out::println);

        Double avgAge = Stream.of(p1, p2, p3, p4, p5, p6)
                .collect(Collectors.averagingDouble(Player::getAge));
        System.out.println("Avg Age: " + avgAge);

        Integer sumAge = Stream.of(p1, p2, p3, p4, p5, p6)
                .collect(Collectors.summingInt(Player::getAge));
        System.out.println("Sum Age: " + sumAge);

        Long count = Stream.of(p1, p2, p3, p4, p5, p6)
                .collect(Collectors.counting());
        System.out.println("Count:" + count);


        Stream.of(p1, p2, p3, p4, p5, p6)
                .sorted(playerSalaryComparator)
                .forEach(System.out::println);


        IntSummaryStatistics intSummaryStatistics = Stream.of(p1, p2, p3, p4, p5, p6)
                .mapToInt(Player::getAge)
                .summaryStatistics();

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());


        int[] numbers = {5, 2, 8, 3, 1};

        int i = Arrays.stream(numbers).sorted().skip(1).findFirst().orElseGet(() -> 999);
        System.out.println(i);


        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Watermelon", "Orange"};
        Arrays.stream(fruits).distinct().forEach(System.out::println);

        int[] arrayInt = {5, 2, 8, 3, 1};
        System.out.println(Arrays.stream(arrayInt).skip(0).reduce((x, y) -> x * y).getAsInt());
    }

    private static final Comparator<Player> playerSalaryComparator = (o1, o2) -> Integer.compare(o2.getSalary(), o1.getSalary());
    private static final Comparator<Player> playerAgeComparator = Comparator.comparingInt(Player::getAge);
}
