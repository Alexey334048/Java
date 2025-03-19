package task3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Миркевич Вероника", 100000),
                new Employee("Морозов Алексей", 100.100),
                new Employee("Хурс Артёмчик", 5000),
                new Employee("Анташкевич Полина", 300)
        };

        System.out.println("Отчет на английском:");
        FullReport.generateReport(employees, Locale.ENGLISH);

        System.out.println("\nОтчет на русском:");
        FullReport.generateReport(employees, new Locale("ru","RU"));
    }
}

