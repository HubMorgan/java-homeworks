package lesson5;

public class Employee {
    String firstName;
    String middleName;
    String lastName;              //Я дольше придумывал, как назвать переменную для отчества, чем писал этот код.
    int age;
    String department;
    String email;
    String tel;
    double salary;
    static int employeeCounter = 0;

    public Employee(String firstName, String middleName, String lastName, int age, String department, String email, String tel, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        employeeCounter++;
        System.out.println("Сотрудник №" + employeeCounter + " создан.");
        System.out.println();
    }

    public void showInfo() {
        System.out.println("Информация о сотруднике: ");
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + department);
        System.out.println("Email: " + email);
        System.out.println("Контактный телефон: " + tel);
        System.out.println("Зарплата: " + salary + '\u20bd');
        System.out.println();
    }

    public int showAge() {
        return age;
    }
}
