import java.util.Scanner;

public class MessengerRavens {
    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input M and N
        long M = sc.nextLong();
        int N = sc.nextInt();

        // Input difficulty values
        long[] D = new long[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextLong();
        }

        // Calculate the XOR sum of all difficulties
        long xorSum = 0;
        for (long d : D) {
            xorSum ^= d;
        }

        // Check if M is odd or even
        if (M % 2 == 0) {
            System.out.println(0); // If M is even, the result is 0
        } else {
            System.out.println(xorSum % MOD); // If M is odd, the result is the XOR sum modulo MOD
        }
    }
}