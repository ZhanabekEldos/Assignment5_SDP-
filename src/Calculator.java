import strategy.Operation;
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        if (operation == null) {
            throw new IllegalStateException("Operation not set!");
        }
        return operation.execute(a, b);
    }
}
