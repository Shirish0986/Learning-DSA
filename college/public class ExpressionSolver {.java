import java.util.Scanner;

public class ExpressionSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();

        // Split the equation into left and right parts
        String[] parts = expression.split("=");
        String left = parts[0];
        String right = parts[1];

        // Evaluate the left and right expressions
        int leftValue = evaluateExpression(left.replace("X", "0"));
        int rightValue = evaluateExpression(right.replace("X", "0"));

        // Find the position of 'X' and adjust accordingly
        if (left.contains("X")) {
            System.out.println(rightValue - leftValue);
        } else {
            System.out.println(leftValue - rightValue);
        }
    }

    // Method to evaluate the value of an expression without X
    private static int evaluateExpression(String expr) {
        int result = 0;
        int sign = 1;
        int currentNumber = 0;
        for (char c : expr.toCharArray()) {
            if (c == '+') {
                result += sign * currentNumber;
                sign = 1;
                currentNumber = 0;
            } else if (c == '-') {
                result += sign * currentNumber;
                sign = -1;
                currentNumber = 0;
            } else {
                currentNumber = currentNumber * 10 + (c - '0');
            }
        }
        result += sign * currentNumber; // Add the last number
        return result;
    }
}