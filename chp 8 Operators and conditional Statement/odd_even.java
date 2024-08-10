import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        if (n%2==0) {
            System.out.println("It's Even");
        }
        else{
            System.out.println("Its Odd");
        }
        sc.close();
    }
}
