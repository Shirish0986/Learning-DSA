import java.io.*;

public class ExpressionSolver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine().trim(); // Input the equation

        // Split the expression into LHS and RHS
        String[] sides = expression.split("=");

        // Evaluate LHS and RHS
        int[] lhs = evaluateSide(sides[0]);
        int[] rhs = evaluateSide(sides[1]);

        // Combine results: Move constants and coefficients to the same side
        int xCoefficient = lhs[1] - rhs[1];
        int constantSum = rhs[0] - lhs[0];

        // Solve for X
        if (xCoefficient == 1) {
            System.out.println(constantSum);
        } else if (xCoefficient == -1) {
            System.out.println(-constantSum);
        } else {
            System.out.println("Invalid or unsupported equation");
        }
    }

    // Function to evaluate a side and return an array [constantSum, xCoefficient]
    private static int[] evaluateSide(String side) {
        String[] terms = side.replace("-", "+-").split("\\+"); // Split into terms
        int constantSum = 0;
        int xCoefficient = 0;

        for (String term : terms) {
            if (term.equals("X")) { // +X
                xCoefficient += 1;
            } else if (term.equals("-X")) { // -X
                xCoefficient -= 1;
            } else if (!term.isEmpty()) { // Numeric term
                constantSum += Integer.parseInt(term);
            }
        }

        return new int[]{constantSum, xCoefficient};
    }
}
