package Task3;

public class SimpleFraction implements FractionOperations {
    private Number number;

    public SimpleFraction(int numerator, int denominator) {
        this.number = new Number(numerator, denominator);
    }

    public void display() {
        System.out.println(number.getNumerator() + "/" + number.getDenominator());
    }

    @Override
    public SimpleFraction add(SimpleFraction other) {
        int newNumerator = this.number.getNumerator() * other.number.getDenominator() + other.number.getNumerator() * this.number.getDenominator();
        int newDenominator = this.number.getDenominator() * other.number.getDenominator();
        return new SimpleFraction(newNumerator, newDenominator);
    }

    @Override
    public SimpleFraction subtract(SimpleFraction other) {
        int newNumerator = this.number.getNumerator() * other.number.getDenominator() - other.number.getNumerator() * this.number.getDenominator();
        int newDenominator = this.number.getDenominator() * other.number.getDenominator();
        return new SimpleFraction(newNumerator, newDenominator);
    }

    @Override
    public SimpleFraction multiply(SimpleFraction other) {
        int newNumerator = this.number.getNumerator() * other.number.getNumerator();
        int newDenominator = this.number.getDenominator() * other.number.getDenominator();
        return new SimpleFraction(newNumerator, newDenominator);
    }

    @Override
    public SimpleFraction divide(SimpleFraction other) {
        int newNumerator = this.number.getNumerator() * other.number.getDenominator();
        int newDenominator = this.number.getDenominator() * other.number.getNumerator();
        return new SimpleFraction(newNumerator, newDenominator);
    }
}
