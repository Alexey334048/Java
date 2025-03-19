package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Алексей", "Морозов");
        Tester tester2 = new Tester("Артем", "Хурс", 3, "В1");
        Tester tester3 = new Tester("Вероника", "Миркевич", 5, "С1", 3000.0);

        tester1.printInfo();
        tester2.printInfo();
        tester3.printInfo(500);
        tester3.printInfo(500, "EUR");

        Tester.companyPolicy();
    }
}
