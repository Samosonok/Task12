import java.util.*;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Main {

    static Employee employee;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(createEmployee("Freddie", "Mercury", 25000.00));
        employees.add(createEmployee("Paul", "McCartney", -20000.00));
        employees.add(createEmployee("Josдддддддeph", "McCartney", 20000.00));
        employees.add(createEmployee("David", "Bowie", 23000.00));

        System.out.println(employees);
    }

    public static Employee createEmployee(String name, String surname, double salary) {
        try {
            employee = new Employee(name, surname, salary);
        } catch (NameException | SalaryException ex) {
            System.err.println(ex.getMessage());
        }
        return employee;
    }
}