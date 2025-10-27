// The Facade Pattern simplifies complex systems by providing a single, unified interface to the client.
import strategy.Operation;
public class Calculator {
    private Operation operation;    // A reference to an Operation object (the current strategy)

    public void setOperation(Operation operation) {
        this.operation = operation;
    }    // Method to set the operation (strategy) dynamically at runtime

    // Method that performs the calculation using the selected strategy
    public double calculate(double a, double b) {
        if (operation == null) {
            throw new IllegalStateException("Operation not set!");
        }
        return operation.execute(a, b);    // Delegate the actual work to the chosen Operation's execute() method
    }
}
//So Calculator is the facade that makes working with strategies simple and clear.
