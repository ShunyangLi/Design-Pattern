package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private double salary;
    // 下属
    private List<Employee> subordinates;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;

        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        if (! this.subordinates.contains(employee)) {
            this.subordinates.add(employee);
        }
    }

    public void remove (Employee employee) {
        if (this.subordinates.contains(employee)) {
            this.subordinates.remove(employee);
        }
    }

    @Override
    public String toString() {
        return ("Employee: [Name: " + this.name+ " ,dept: " + this.dept + " ,salary: " + this.salary + " ]");
    }

    public List<Employee> getSubordinates() {
        return this.subordinates;
    }
}
