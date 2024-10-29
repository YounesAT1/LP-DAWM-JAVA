package Fractions;
import java.util.Arrays;

public class Fraction {
    private final int numerator;       // The numerator of the fraction
    private final int denominator;     // The denominator of the fraction

    // Default constructor (0/1)
    public Fraction() {
        this(0, 1);
    }

    // Constructor with specified numerator and denominator
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Constructor for a fraction with denominator = 1
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    // Constructor to parse fraction from a string (e.g., "3/4")
    public Fraction(String s) {
        Fraction parsedFraction = parseFraction(s);
        this.numerator = parsedFraction.numerator;
        this.denominator = parsedFraction.denominator;
    }

    // Method to calculate the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    // Method to calculate the least common multiple (LCM)
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // Reduces the fraction to its simplest form
    public Fraction reduce() {
        int gcdValue = gcd(numerator, denominator);
        return new Fraction(numerator / gcdValue, denominator / gcdValue);
    }

    // String representation of the fraction
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Adds two fractions and returns the reduced result
    public Fraction add(Fraction f) {
        int newNumerator = numerator * f.denominator + f.numerator * denominator;
        int newDenominator = denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Subtracts two fractions and returns the reduced result
    public Fraction subtract(Fraction f) {
        int newNumerator = numerator * f.denominator - f.numerator * denominator;
        int newDenominator = denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Multiplies two fractions and returns the reduced result
    public Fraction multiply(Fraction f) {
        int newNumerator = numerator * f.numerator;
        int newDenominator = denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Divides two fractions and returns the reduced result
    public Fraction divide(Fraction f) {
        if (f.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int newNumerator = numerator * f.denominator;
        int newDenominator = denominator * f.numerator;
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Checks if two fractions are equal
    public boolean equals(Fraction f) {
        return (numerator * f.denominator == denominator * f.numerator);
    }

    // Compares this fraction with another
    public int compareTo(Fraction f) {
        return Integer.compare(numerator * f.denominator, denominator * f.numerator);
    }

    // Static method to compare two fractions
    public static int compare(Fraction f1, Fraction f2) {
        return Integer.compare(f1.numerator * f2.denominator, f1.denominator * f2.numerator);
    }

    // Returns the first N digits of the decimal representation of the fraction
    public int[] firstNDigits(int n) {
        int[] result = new int[n];
        double decimalValue = (double) numerator / denominator;
        int integerPart = (int) decimalValue;
        double fractionPart = decimalValue - integerPart;

        for (int i = 0; i < n; i++) {
            fractionPart *= 10;
            result[i] = (int) fractionPart;
            fractionPart -= result[i];
        }

        return result;
    }

    // Parses a fraction from a string in the format "num/den"
    public static Fraction parseFraction(String s) {
        String[] parts = s.split("/");
        int num = Integer.parseInt(parts[0].trim());
        int den = Integer.parseInt(parts[1].trim());
        if (den == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return new Fraction(num, den);
    }

    public static void main(String[] args) {
        // Parse command-line arguments as fractions
        Fraction f1 = parseFraction(args[0].trim());
        Fraction f2 = parseFraction(args[2].trim());

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        Fraction f3 = new Fraction(6, 14);
        Fraction f4 = new Fraction(1, 5);

        System.out.println("\nf3 = " + f3);
        System.out.println("f4 = " + f4);

        // Perform arithmetic operations on fractions
        System.out.println("Addition: " + f3 + " + " + f4 + " = " + f3.add(f4));
        System.out.println("Subtraction: " + f3 + " - " + f4 + " = " + f3.subtract(f4));
        System.out.println("Multiplication: " + f3 + " * " + f4 + " = " + f3.multiply(f4));
        System.out.println("Division: " + f3 + " / " + f4 + " = " + f3.divide(f4));

        // Display the first 5 digits of the decimal representations
        System.out.println("First 5 digits of " + f3 + " = " + Arrays.toString(f3.firstNDigits(5)));
        System.out.println("First 5 digits of " + f4 + " = " + Arrays.toString(f4.firstNDigits(5)));
    }
}
