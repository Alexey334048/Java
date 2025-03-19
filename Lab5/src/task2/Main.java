package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку (четная длина): ");
        String str = scanner.nextLine();
        if (str.length() % 2 == 0) {
            int midIndex = str.length() / 2;
            String middle = str.substring(midIndex - 1, midIndex + 1);
            System.out.println("Два средних символа: " + middle);
        } else {
            System.out.println("Длина строки должна быть четной.");
        }

        scanner.close();
    }
}
