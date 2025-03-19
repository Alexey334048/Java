package Task3;

public class Main {
    public static void main(String[] args) {
        SimpleFraction fraction1 = new SimpleFraction(1, 2); // 1/2
        SimpleFraction fraction2 = new SimpleFraction(3, 4); // 3/4

        System.out.print("Дробь 1: ");
        fraction1.display();

        System.out.print("Дробь 2: ");
        fraction2.display();

        SimpleFraction sum = fraction1.add(fraction2);
        System.out.print("Сумма: ");
        sum.display();

        SimpleFraction difference = fraction1.subtract(fraction2);
        System.out.print("Разность: ");
        difference.display();

        SimpleFraction product = fraction1.multiply(fraction2);
        System.out.print("Произведение: ");
        product.display();

        SimpleFraction quotient = fraction1.divide(fraction2);
        System.out.print("Частное: ");
        quotient.display();
    }
}
