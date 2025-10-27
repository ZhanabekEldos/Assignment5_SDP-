import strategy.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");   // Ask the user to enter the first number
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");  // Ask the user to enter the second number
        double b = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");  // Ask the user to choose the operation
        char op = sc.next().charAt(0);

        // Based on user's choice, assign the appropriate operation (strategy)
        switch (op) {
            case '+':
                calculator.setOperation(new AddOperation()); // Use addition strategy  сложения
                break;
            case '-':
                calculator.setOperation(new SubtractOperation()); // Use subtraction strategy вычитания
                break;
            case '*':
                calculator.setOperation(new MultiplyOperation()); // Use multiplication strategy умножения
                break;
            case '/':
                calculator.setOperation(new DivideOperation()); // Use division strategy деления
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        double result = calculator.calculate(a, b);// Perform calculation using the selected strategy
        System.out.println("Result: " + result); // Display the result to the user
    }
}
