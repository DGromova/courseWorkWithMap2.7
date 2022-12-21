import java.util.Collection;

public interface EmployeeBook {
    void addEmployee(String lastName, String firstName, String middleName, byte department, double salary);

    void removeEmployee(String person);

    void printAllEmployees();

    void getEmployee(String employee);

    double salaryMonthsSum();

    void minSalaryEmployee();

    void maxSalaryEmployee();

    void averageMonthsSalary();

    void allNames();

    // Методы повышенной сложности
    void salaryIndex(double index);

    void departmentEmployeesMinSalary(byte departmentNumber);

    void departmentEmployeesMaxSalary(byte departmentNumber);

    double departmentSalaryMonthsSum(byte departmentNumber);

    void departmentAverageMonthsSalary(byte departmentNumber);

    void departmentEmployees(byte departmentNumber);

    void departmentSalaryIndex(byte departmentNumber, double index);

    void employeesSalaryLessThan(double number);

    void employeesSalaryMoreThan(double number);
}
