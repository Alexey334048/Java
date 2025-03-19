package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "Неизвестный", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + experienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата: $" + salary);
    }

    public void printInfo(double bonus) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + experienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата с бонусом: $" + (salary + bonus));
    }

    public void printInfo(double bonus, String currency) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + experienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата с бонусом: " + (salary + bonus) + " " + currency);
    }

    public static void companyPolicy() {
        System.out.println("В компании тестировщики могут получать повышение раз в год.");
    }
}
