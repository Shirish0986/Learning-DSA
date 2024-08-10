import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        if (isprime == true) {
            System.out.println("its prime");
        } else {
            System.out.println("its not prime");

        }
        sc.close();
    }
}
