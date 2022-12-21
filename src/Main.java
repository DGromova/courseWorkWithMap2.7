public class Main {
    public static void main(String[] args) {
        courseWorkWithMap();
    }
    public static void courseWorkWithMap() {
        EmployeeBookImpl e = new EmployeeBookImpl();
        //Заполнение массива сотрудников
        e.addEmployee("Иванов", "Иван", "Иванович", (byte)5, 70_000);
        e.addEmployee("Макаров", "Владимир", "Георгиевич", (byte) 2, 100_000);
        e.addEmployee("Исаев", "Матвей", "Максимович", (byte) 3, 100_000);
        e.addEmployee("Лаптев", "Даниил", "Павлович", (byte) 4, 130_000);
        e.addEmployee("Казакова", "Евгения", "Тимуровна", (byte) 5, 70_000);
        e.addEmployee("Лапшина", "Юлия", "Антоновна", (byte) 1, 70_000);
        e.addEmployee("Казаков", "Виталий", "Игоревич", (byte) 3, 95_000);
        e.addEmployee("Лазарева", "Дарья", "Николаевна", (byte) 1, 130_000);
        e.addEmployee("Максимов", "Александр", "Артурович", (byte) 5, 90_000);
        e.addEmployee("Зотова", "Екатерина", "Валентиновна", (byte) 4, 120_000);
        //Удаление сотрудников по ФИО
        e.removeEmployee("Иванов Иван Иванович");
        //СПИСОК ВСЕХ СОТРУДНИКОВ
        e.printAllEmployees();
        System.out.println();
        //Получение данных о сотруднике по ФИО
        e.getEmployee("Лаптев Даниил Павлович");
        e.getEmployee("Лаптев Данил Павлович");
        System.out.println();
        // Сумма затрат на зарплаты в месяц
        e.salaryMonthsSum();
        System.out.println();
        // Сотрудник с минимальной зарплатой
        e.minSalaryEmployee();
        System.out.println();
        // Сотрудник с максимальной зарплатой
        e.maxSalaryEmployee();
        System.out.println();
        // Среднее значение зарплат
        e.averageMonthsSalary();
        System.out.println();
        // Ф.И.О. всех сотрудников
        e.allNames();
        System.out.println();
        // Задания повышенной сложности
        // Увеличение зарплат в index раз
        e.salaryIndex(1.2);
        System.out.println();
        // Сотрудники выбранного отдела с минимальной зарплатой
        e.departmentEmployeesMinSalary((byte) 5);
        System.out.println();
        // Сотрудники выбранного отдела с максимальной зарплатой
        e.departmentEmployeesMaxSalary((byte) 5);
        System.out.println();
        e.departmentEmployeesMaxSalary((byte) 2);
        System.out.println();
        e.departmentEmployeesMaxSalary((byte) 3);
        System.out.println();
        // Сумма затрат в месяц на зарплаты по отделу
        e.departmentSalaryMonthsSum((byte) 5);
        System.out.println();
        // Среднее значение зарплат в выбранном отделе
        e.departmentAverageMonthsSalary((byte) 5);
        System.out.println();
        // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
        e.departmentSalaryIndex((byte) 3, 1.3);
        System.out.println();
        // Список сотрудников выбранного отдела
        e.departmentEmployees((byte) 5);
        System.out.println();
        // Получение всех сотрудников с зарплатой меньше заданного числа
        e.employeesSalaryLessThan(130_000);
        System.out.println();
        // Получение всех сотрудников с зарплатой больше или равной заданному числу
        e.employeesSalaryMoreThan(130_000);
        System.out.println();


    }
}