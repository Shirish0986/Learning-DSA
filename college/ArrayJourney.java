import java.util.*;

public class ArrayJourney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            // Read the size of the array
            int N = sc.nextInt();

            // Read the array elements
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Read the maximum step length K
            int K = sc.nextInt();

            // Calculate the maximum score
            result.append(findMaxScore(N, K, arr)).append("\n");
        }

        // Output all results at once
        System.out.print(result.toString());
        sc.close();
    }

    private static long findMaxScore(int N, int K, int[] arr) {
        // Initialize the dp array for maximum scores
        long[] dp = new long[N];
        dp[0] = arr[0]; // Start with the first element

        // Deque for maintaining indices of potential maximum scores
        Deque<Integer> deque = new LinkedList<>();
        deque.add(0);

        for (int i = 1; i < N; i++) {
            // Remove indices outside the range [i-K, i-1]
            while (!deque.isEmpty() && deque.peekFirst() < i - K) {
                deque.pollFirst();
            }

            // Calculate the maximum score for the current index
            dp[i] = dp[deque.peekFirst()] + arr[i];

            // Maintain the deque in decreasing order of dp values
            while (!deque.isEmpty() && dp[deque.peekLast()] <= dp[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
        }

        // The maximum score to reach the last index
        return dp[N - 1];
    }
}