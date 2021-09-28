/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Employee {

    String name;
    String surname;
    double salary;

    public Employee(String name, String surname, double salary) throws SalaryException, NameException {
        Validator.checkName(name, surname);
        Validator.checkSalary(salary);
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{ " +
                "name: " + name +
                ", surname: " + surname +
                ", salary: $" + salary +
                '}';
    }
}