package strategy;
public class DivideOperation implements Operation {
    @Override
    public double execute(double a, double b) {      // Check if the divisor is zero to prevent division error
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
       }
        return a / b;
    }
}
