import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания (1-5): ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                System.out.println("Задания 1: Приложение, вычисляющее значение выражения:");
                double x = Math.pow(4, 2) - 2 * 4;
                System.out.print("Ответ: ");
                System.out.println(x);
                break;
            case 2:
                System.out.println("Задания 2: Дан одномерный массив. Переставить элементы массива задом-наперед.");
                int[] array = {1, 2, 3, 4, 5};
                for (int i = 0; i < array.length / 2; i++) {
                    int temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                }
                System.out.print("Перевернутый массив: ");

                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Задания 3: Дан двумерный массив. Сформировать одномерный массив только из четных элементов двумерного массива.");
                int[][] matrix = new int[3][3];
                Random random = new Random();

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) { // Исправлено здесь
                        matrix[i][j] = random.nextInt(40);
                    }
                }

                int count = 0;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] % 2 == 0) {
                            count++;
                        }
                    }
                }

                int[] evenArray = new int[count];
                int index = 0;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] % 2 == 0) {
                            evenArray[index++] = matrix[i][j];
                        }
                    }
                }

                System.out.println("Одномерный массив из чётных элементов:");
                for (int i = 0; i < evenArray.length; i++) {
                    System.out.print(evenArray[i] + " ");
                }
                break;
            case 4:
                System.out.println("Задания 4: ");
                System.out.println("Выберите подзадание (1, 2, 3):");
                int subChoice = scanner.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.print("Введите номер дня недели (1-7): ");
                        int day = scanner.nextInt();
                        String dayName;
                        switch (day) {
                            case 1:
                                dayName = "Понедельник";
                                break;
                            case 2:
                                dayName = "Вторник";
                                break;
                            case 3:
                                dayName = "Среда";
                                break;
                            case 4:
                                dayName = "Четверг";
                                break;
                            case 5:
                                dayName = "Пятница";
                                break;
                            case 6:
                                dayName = "Суббота";
                                break;
                            case 7:
                                dayName = "Воскресенье";
                                break;
                            default:
                                dayName = "Неверный номер дня";
                        }
                        System.out.println("День недели: " + dayName);
                        break;

                    case 2:
                        System.out.print("Введите столицу: ");
                        String capital = scanner.next();
                        String country;
                        switch (capital) {
                            case "Афины":
                                country = "Греция";
                                break;
                            case "Белград":
                                country = "Сербия";
                                break;
                            case "Берлин":
                                country = "Германия";
                                break;
                            case "Токио":
                                country = "Япония";
                                break;
                            case "Киев":
                                country = "Украина";
                                break;
                            case "Канберра":
                                country = "Австралия";
                                break;
                            default:
                                country = "Неизвестная страна";
                        }
                        System.out.println("Страна: " + country);
                        break;

                    case 3:
                        System.out.print("Введите n: ");
                        int k = scanner.nextInt();
                        int sum = 0;
                        int j = 0;
                        while (j <= k) {
                            if (j % 2 != 0) {
                                sum += j;
                            }
                            j++;
                        }
                        System.out.println("Сумма нечетных чисел от 0 до " + k + ": " + sum);
                        break;

                    default:
                        System.out.println("Неверный выбор подзадания.");
                }
                break;
            case 5:
                System.out.println("Задание 5: Выведите на экран все целые числа в диапазоне 43-181 на экран с помощью функции FOR. Между числами знак табуляции");
                for (int i = 43; i <= 181; i++) {
                    System.out.print(i + "\t");
                }
                break;
            default:
                System.out.println("Неизвестное задание");
                break;
        }
    }
}
