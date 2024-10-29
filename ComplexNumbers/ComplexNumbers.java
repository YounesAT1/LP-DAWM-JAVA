package ComplexNumbers;

public class ComplexNumbers {
    private double realPart;  // Real part of the complex number
    private double imaginaryPart; // Imaginary part of the complex number

    // Constructor to initialize the complex number with given real and imaginary parts
    public ComplexNumbers(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Getters and Setters
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // String representation of the complex number
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        // Append both real and imaginary parts when both are non-zero
        if (realPart != 0 && imaginaryPart != 0) {
            result.append(realPart);
            if (imaginaryPart > 0) {
                result.append("+");
            }
            result.append(imaginaryPart).append("i");
        }
        // Append only the real part if the imaginary part is zero
        else if (imaginaryPart == 0) {
            result.append(realPart);
        }
        // Append only the imaginary part if the real part is zero
        else {
            result.append(imaginaryPart).append("i");
        }

        return result.toString();
    }

    // Calculates the magnitude (modulus) of the complex number
    public double modulus() {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    // Adds another complex number to this complex number
    public ComplexNumbers add(ComplexNumbers other) {
        this.realPart += other.realPart;
        this.imaginaryPart += other.imaginaryPart;
        return this;
    }

    // Multiplies this complex number by another complex number
    public ComplexNumbers multiply(ComplexNumbers other) {
        double tempReal = realPart * other.realPart - imaginaryPart * other.imaginaryPart;
        imaginaryPart = realPart * other.imaginaryPart + imaginaryPart * other.realPart;
        realPart = tempReal;
        return this;
    }

    // Negates the complex number
    public ComplexNumbers negate() {
        realPart *= -1;
        imaginaryPart *= -1;
        return this;
    }
}
