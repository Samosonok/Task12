/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Validator {

    public static void checkSalary(double salary) throws EmployeeException {
        if (salary < 0) {
            throw new EmployeeException("TooSmallSalaryException in " + salary);
        }
    }

    public static void checkName(String name, String surname) throws EmployeeException {
        if (!name.matches("[a-zA-Z]+") | !surname.matches("[a-zA-Z]+")) {
            throw new EmployeeException("ImpossibleNameException in " + name + " " + surname);
        }
    }
}
