import java.util.Scanner;

public class pq_4_multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter number: ");
        int n=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n +"X"+ i + " = " + (n*i));
        }
        sc.close();
    }
}
