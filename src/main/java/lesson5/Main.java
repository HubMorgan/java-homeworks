package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Иван", "Иванович", "Иванов", 52, "Преподаватель", "ivanushkiInternational@gg.com", "+7-999-744-55-42", 25647.93);
        empArray[1] = new Employee("Александр", "Юрьевич", "Круглов", 37, "Воспитатель", "kruglyash@yandex.ru", "+7-999-744-55-33", 36880);
        empArray[2] = new Employee("Петр", "Олегович", "Орлов", 26, "Хирург", "tophirurg@gmail.com", "+7-990-232-33-22", 130000);
        empArray[3] = new Employee("Евгений", "Зиданович", "Воробьев", 41, "Преподаватель", "ivanushkiInternational@gg.com", "+7-999-799-33-33", 67980);
        empArray[4] = new Employee("Вячеслав", "Валентинович", "Иванов", 30, "Водитель такси", "ivanushkiInternational@gg.com", "+7-950-333-24-54", 32520);


        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].age > 40) {
                empArray[i].showInfo();
            }
        }

    }
}
