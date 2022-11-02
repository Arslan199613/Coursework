import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Employee[] employees;
        employees = new Employee[10];
        employees[0] = new Employee("Сергеев Петр Игоревич", "1", 34000);
        employees[1] = new Employee("Андреев Игорь Иванович", "2", 45500);
        employees[2] = new Employee("Федоров Федор Федорович", "3", 43350);
        employees[3] = new Employee("Пушкин Владимир Александрович", "4", 44800);
        employees[4] = new Employee("Куриной Михаил Пантелеевич", "5", 50700);
        employees[5] = new Employee("Бочкорёв Александр Петрович", "1", 51300);
        employees[6] = new Employee("Сергеев Сергей Игоревич", "2", 49700);
        employees[7] = new Employee("Горчаков Владислав Вадимович", "3", 40800);
        employees[8] = new Employee("Некрасов Вадим Некрасович", "4", 47300);
        employees[9] = new Employee("Горохов Александр Горохович", "5", 60600);
        System.out.println("=======================Список всех сотрудников со всеми данными============================================");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(employees[i].toString());//вывод сотрудника со всеми данными...
        }
        double minSalary = employees[0].getSalary();
        for (int n = 0; n < employees.length; n++) {
            if (employees[n].getSalary() < minSalary) {
                minSalary = employees[n].getSalary();
            }
        }
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println();
        System.out.println("Cумма затрат на зарплаты: " + sum);
        System.out.println();
        System.out.println("Минимальная зарплата: " + minSalary);
        System.out.println();
        System.out.println("Максимальное зарплата: " + maxSalary);
        System.out.println();
        System.out.println("Среднее значение зарплат:" + sum / employees.length);
        System.out.println();
        System.out.println("=============ФИО всех сотрудников=================");
        for (int n = 0; n < employees.length; n++) {
            System.out.println(employees[n].getFullName());
        }
    }
}