package strategy;
public class MultiplyOperation implements Operation {
    // Override the execute method from the Operation interface
        @Override
    public double execute(double a, double b) {
        return a * b; // Return the result of multiplying a by b
    }
}
