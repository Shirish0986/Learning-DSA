import java.util.*;

public class MaxArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input rows and columns
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        // Input the matrix
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Precompute the prefix sum
        int[][] prefixSum = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                prefixSum[i][j] = matrix[i - 1][j - 1]
                                + prefixSum[i - 1][j]
                                + prefixSum[i][j - 1]
                                - prefixSum[i - 1][j - 1];
            }
        }

        // Input the number of queries
        int Q = scanner.nextInt();
        StringBuilder results = new StringBuilder();

        // Process each query
        for (int q = 0; q < Q; q++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int K = scanner.nextInt();

            // Binary search for the maximum size
            int low = 0, high = Math.min(R, C), maxArea = 0;
            while (low <= high) {
                int mid = (low + high) / 2;

                // Define the boundaries of the square
                int top = x - mid, left = y - mid, bottom = x + mid, right = y + mid;

                if (top >= 0 && left >= 0 && bottom < R && right < C) {
                    // Calculate the number of black cells in the square
                    int blackCells = prefixSum[bottom + 1][right + 1]
                                   - prefixSum[bottom + 1][left]
                                   - prefixSum[top][right + 1]
                                   + prefixSum[top][left];

                    if (blackCells <= K) {
                        // Update max area if valid
                        maxArea = (2 * mid + 1) * (2 * mid + 1);
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    high = mid - 1;
                }
            }

            results.append(maxArea).append("\n");
        }

        // Output results
        System.out.print(results);
        scanner.close();
    }
}