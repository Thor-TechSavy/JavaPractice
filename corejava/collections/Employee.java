package corejava.collections;

import java.util.*;

public class Employee implements java.lang.Comparable<Employee> {

    public List<String> getCities() {
        return cities;
    }

    List<String> cities = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;
    private String name;
    private int age;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee(int id, String name, int age, List<String> cities) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cities = new ArrayList<>(cities);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee otherEmp = (Employee) obj;

        return this.name.equals(otherEmp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Collections.unmodifiableCollection(employeeArrayList);

        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();


        Iterator<Map.Entry<Integer, Employee>> iterator = employeeHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Employee> entry = iterator.next();

            employeeHashMap.put(entry.getKey(), entry.getValue());
        }

        employees[0] = new Employee(2);
        employees[1] = new Employee(3);
        employees[2] = new Employee(1);
        employees[3] = new Employee(7);

        Employee[] employees2 = new Employee[4];

        employees2[0] = new Employee(2, "Jack");
        employees2[1] = new Employee(3, "Antonio");
        employees2[2] = new Employee(1, "Greg");
        employees2[3] = new Employee(7, "Bob");

        Arrays.sort(employees);
        Arrays.sort(employees2, employeeComparator);
        System.out.println(Arrays.toString(employees));
        System.out.println(Arrays.toString(employees2));
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }

    public static Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public int getAge() {
        return age;
    }
}
