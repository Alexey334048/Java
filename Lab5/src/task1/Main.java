package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        if (str.endsWith("!!!")) {
            System.out.println("Строка заканчивается на '!!!'");
        } else {
            System.out.println("Строка не заканчивается на '!!!'");
        }
        scanner.close();

    }
}
