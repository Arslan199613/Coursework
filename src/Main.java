public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Сидоров Олег Александрович", "1", 30000);
        employees[1] = new Employee("Андреев Игорь Иванович", "2", 45500);
        employees[2] = new Employee("Федоров Федор Федорович", "3", 43350);
        employees[3] = new Employee("Пушкин Владимир Александрович", "4", 44800);
        employees[4] = new Employee("Куриной Михаил Пантелеевич", "5", 50700);
        employees[5] = new Employee("Бочкорёв Александр Петрович", "1", 51300);
        employees[6] = new Employee("Сергеев Сергей Игоревич", "2", 49700);
        employees[7] = new Employee("Горчаков Владислав Вадимович", "3", 40800);
        employees[8] = new Employee("Некрасов Вадим Некрасович", "4", 43000);
        employees[9] = new Employee("Горохов Александр Горохович", "5", 37000);

        getEmployeeWithAllData();
        System.out.println(getMinSalary());
        System.out.println(getMaxSalary());
        System.out.println(getSumSalary());
        System.out.println(getAverageSalary());
        getFullName();


    }

    public static void getEmployeeWithAllData() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public static double getMinSalary() {

        double minSalary = employees[0].getSalary();
        for (int n = 0; n < employees.length; n++) {
            if (employees[n].getSalary() < minSalary) {
                minSalary = employees[n].getSalary();
            }
        }
        return minSalary;
    }

    public static double getMaxSalary() {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static double getSumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static double getAverageSalary() {
        double average = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
            }
        }
        return getSumSalary() / count;
    }

    public static void getFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            Employee employee = employees[i];
            System.out.println(employee.getFullName());
        }
    }
}

