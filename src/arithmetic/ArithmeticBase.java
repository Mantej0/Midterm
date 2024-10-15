package arithmetic;

import java.util.Scanner;

public class ArithmeticBase {
    public double x, y;

    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    double calculate(double x, double y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = sc.next().toUpperCase();

        Operation operation = Operation.valueOf(input);

        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y != 0) {
                    return x / y;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}
