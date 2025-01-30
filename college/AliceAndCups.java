import java.util.Scanner;

public class AliceAndCups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sequence of swaps
        String moves = scanner.nextLine();

        // Start with the ball under the leftmost cup (index 1)
        int ballPosition = 1;

        // Iterate over each move in the string
        for (char move : moves.toCharArray()) {
            if (move == 'A') {
                if (ballPosition == 1) {
                    ballPosition = 2;
                } else if (ballPosition == 2) {
                    ballPosition = 1;
                }
            } else if (move == 'B') {
                if (ballPosition == 2) {
                    ballPosition = 3;
                } else if (ballPosition == 3) {
                    ballPosition = 2;
                }
            } else if (move == 'C') {
                if (ballPosition == 1) {
                    ballPosition = 3;
                } else if (ballPosition == 3) {
                    ballPosition = 1;
                }
            }
        }

        // Output the final position of the ball
        System.out.println(ballPosition);

        scanner.close();
    }
}