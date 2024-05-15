package corejava.functional;

import corejava.collections.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee(1, "anonio", 30, List.of("Lux", "Bel") );
        Employee employee2 = new Employee(1, "Tnonio", 30, List.of("Paris", "Bel") );

        employees.add(employee1);
        employees.add(employee2);

        Set<String> collect = employees.stream().flatMap(employee -> employee.getCities().stream()).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
