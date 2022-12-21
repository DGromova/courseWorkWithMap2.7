public class Employee {
    private int id;
    static int count = 1;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private byte department;
    private double salary;

    public Employee(String lastName, String firstName, String middleName, byte department, double salary) {
        this.id = count++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }
    public int getId() { return id; }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public byte getDepartment() {
        return department;
    }


    public double getSalary() {
        return salary;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.out.println("Salary less than 0");
            return;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  " id:" + id + " " + lastName + " " + firstName + " " + middleName + " Отдел: " + department + " Зарплата: " + salary + " рублей.";
    }
}
