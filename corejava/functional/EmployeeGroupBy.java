package corejava.functional;

import corejava.collections.Employee;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeGroupBy {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Tars", 30);
        Employee employee2 = new Employee(2, "Bob", 30);
        Employee employee3 = new Employee(3, "John", 20);
        Employee employee4 = new Employee(4, "John", 20);
        Employee employee5 = new Employee(4, "Jack", 25);
        Employee employee6 = new Employee(1, "Jill", 20);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee6);
        employees.add(employee5);
        employees.add(employee3);
        employees.add(employee2);
        employees.add(employee5);
        employees.add(employee1);

       employees
                .stream()
              //  .filter(e -> e.getId() % 2 == 0)
                .collect(Collectors.groupingBy(Employee::getAge, TreeMap::new, Collectors.toSet()))
                .forEach((integer, employees1) -> System.out.println(integer + ":" + employees1));

    }
}
