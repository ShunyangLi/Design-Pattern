package CompositePattern;

/**
 * 组合模式可以理解为自引用的一种，把简单的和复杂的都看作一种
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee ceo = new Employee("Charles","CEO", 100000.0);
        Employee employee1 = new Employee("employee1","employee",1200.0);
        Employee employee2 = new Employee("employee2", "employee", 1230.0);

        ceo.add(employee1);
        ceo.add(employee2);

        System.out.println(ceo.toString());

        for (Employee employee:ceo.getSubordinates()) {
            System.out.println(employee);
        }
    }

}
