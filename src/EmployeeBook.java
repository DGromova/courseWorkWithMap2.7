import java.util.*;

public class EmployeeBook {
    private Map<String, Employee> employeesMap = new HashMap<>();

    public void addEmployee(String lastName, String firstName, String middleName, byte department, double salary) {
        Employee employee = new Employee(lastName, firstName, middleName, department, salary);
        employeesMap.putIfAbsent(lastName + " " + firstName + " " + middleName, employee);
    }

    public void removeEmployee(String person) {
        if (employeesMap.containsKey(person)) {
            employeesMap.remove(person);
        } else {
            System.out.println("Сотрудник с таким именем не найден");
        }
    }

    public void printAllEmployees() {
        for (Employee employeesMap : employeesMap.values()) {
            System.out.println(employeesMap);
        }
    }

    public void getEmployee(String employee) {
        if (employeesMap.containsKey(employee)) {
            System.out.println(employeesMap.get(employee));
        } else {
            System.out.println("Сотрудник не найден");
        }
    }

    public double salaryMonthsSum() {
        double salaryMonthsSum = 0;
        for (Employee employee : employeesMap.values()) {
            salaryMonthsSum = salaryMonthsSum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryMonthsSum + " рублей.");
        return salaryMonthsSum;
    }
    public void minSalaryEmployee() {
        Set<Double> actualSalaryList = new HashSet();
        for (Employee employee : employeesMap.values()) {
            actualSalaryList.add(employee.getSalary());
        }
        double minSalary;
        minSalary = Collections.min(actualSalaryList);
        for (Employee employee : employeesMap.values()) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employee);
            }
        }
    }
    public void maxSalaryEmployee() {
        Set<Double> presentSalaryList = new HashSet();
        for (Employee employee : employeesMap.values()) {
            presentSalaryList.add(employee.getSalary());
        }
        double maxSalary;
        maxSalary = Collections.max(presentSalaryList);
        for (Employee employee : employeesMap.values()) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employee);
            }
        }
    }

    public void averageMonthsSalary() {
        System.out.println("Среднее значение зарплат: " + salaryMonthsSum() / (employeesMap.size()) + " рублей.");
    }

    public void allNames() {
        System.out.println("Ф.И.О. всех сотрудников:");
        for (Employee employee : employeesMap.values()) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }

    // Методы повышенной сложности
    public void salaryIndex(double index) {
        for (Employee employee : employeesMap.values()) {
            employee.setSalary(employee.getSalary() * index);
        }
    }

    public void departmentEmployeesMinSalary(byte departmentNumber) {
        Set<Double> actualDepartmentSalaryList = new HashSet();
        for (Employee employee : employeesMap.values()) {
            if(employee.getDepartment() == departmentNumber) {
                actualDepartmentSalaryList.add(employee.getSalary());
            }
        }
        double minSalary;
        minSalary = Collections.min(actualDepartmentSalaryList);
        for (Employee employee : employeesMap.values()) {
            if (employee.getSalary() == minSalary & employee.getDepartment() == departmentNumber) {
                System.out.println(("Сотрудник отдела №" + departmentNumber + " с минимальной зарплатой: " + "id:" + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " +
                        employee.getMiddleName() + " Зарплата " + employee.getSalary() + " рублей."));
            }
        }
    }

    public void departmentEmployeesMaxSalary(byte departmentNumber) {
        Set<Double> presentDepartmentSalaryList = new HashSet();
        for (Employee employee : employeesMap.values()) {
            if(employee.getDepartment() == departmentNumber) {
                presentDepartmentSalaryList.add(employee.getSalary());
            }
        }
        double maxSalary;
        maxSalary = Collections.max(presentDepartmentSalaryList);
        for (Employee employee : employeesMap.values()) {
            if (employee.getSalary() == maxSalary & employee.getDepartment() == departmentNumber) {
                System.out.println(("Сотрудник отдела №" + departmentNumber + " с максимальной зарплатой: " + "id:" + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " +
                        employee.getMiddleName() + " Зарплата " + employee.getSalary() + " рублей."));
            }
        }
    }

    public double departmentSalaryMonthsSum(byte departmentNumber) {
        double departmentSalaryMonthsSum = 0;
        for (Employee employee : employeesMap.values()) {
            if (employee.getDepartment() == departmentNumber) {
                departmentSalaryMonthsSum = departmentSalaryMonthsSum + employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum + " рублей.");
        return departmentSalaryMonthsSum;
    }

    public void departmentAverageMonthsSalary(byte departmentNumber) {
        byte x = 0;
        for (Employee employee : employeesMap.values()) {
            if (employee.getDepartment() == departmentNumber) {
                x++;
            }
        }
        System.out.println("Среднее значение зарплат в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum(departmentNumber) / x + " рублей.");
    }

    public void departmentEmployees(byte departmentNumber) {
        System.out.println("Список сотрудников выбранного отдела: ");
        String result = null;
        for (Employee employee : employeesMap.values()) {
            if (employee.getDepartment() == departmentNumber) {
                result = "EmployeeFound";
                System.out.println("Сотрудник отдела №" + departmentNumber + ": " + "id:" + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " +
                        employee.getMiddleName() + " Зарплата " + employee.getSalary() + " рублей.");
            }
        }
        if (result == null) {
            System.out.println("Выбранного отдела не существует");
        }
    }

    public void departmentSalaryIndex(byte departmentNumber, double index) {
        for (Employee employee : employeesMap.values()) {
            if (employee.getDepartment() == departmentNumber) {
                employee.setSalary(employee.getSalary() * index);
            }
        }
    }

    public void employeesSalaryLessThan(double number) {
        System.out.println("Все сотрудники с зарплатой меньше заданного числа: ");
        for (Employee employee : employeesMap.values()) {
            if (employee.getSalary() < number) {
                System.out.println("id:" + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " Зарплата: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void employeesSalaryMoreThan(double number) {
        System.out.println("Все сотрудники с зарплатой больше или равной заданному числу: ");
        for (Employee employee : employeesMap.values()) {
            if (employee.getSalary() >= number) {
                System.out.println("id:" + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " Зарплата: " + employee.getSalary() + " рублей.");
            }
        }
    }
}