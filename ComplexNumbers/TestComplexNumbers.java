package ComplexNumbers;

public class TestComplexNumbers {
    public static void main(String[] args) {
        ComplexNumbers z1 = new ComplexNumbers(1,2);
        ComplexNumbers z2 = new ComplexNumbers(3,-5);
        ComplexNumbers z3 = new ComplexNumbers(1,1);
        ComplexNumbers zt1 = new ComplexNumbers(1,2);
        ComplexNumbers zt2= new ComplexNumbers(3,-5);

        z1.add(z2);
        zt2.add(new ComplexNumbers(-1,0));
        zt1.add(zt2);
        z1.multiply(zt1);
        System.out.println(z1);
    }
}
