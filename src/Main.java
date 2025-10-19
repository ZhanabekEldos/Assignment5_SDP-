import strategy.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': calculator.setOperation(new AddOperation()); break;
            case '-': calculator.setOperation(new SubtractOperation()); break;
            case '*': calculator.setOperation(new MultiplyOperation()); break;
            case '/': calculator.setOperation(new DivideOperation()); break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        double result = calculator.calculate(a, b);
        System.out.println("Result: " + result);
    }
}
