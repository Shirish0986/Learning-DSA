import java.util.Scanner;

public class pq_2_evenOdd {
    public static boolean evenorodd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        if (evenorodd(n)) {
            System.out.println("the number is even");

        } else {
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
