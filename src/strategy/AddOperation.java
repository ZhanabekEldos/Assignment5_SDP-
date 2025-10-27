//concrete strategies.
package strategy;
public class AddOperation implements Operation {

    @Override
    public double execute(double a, double b) {
        return a + b;  // Return the result of adding a and b
    }
}
