import java.util.Scanner;

public class pq_3_palindrome {
    public static boolean palindrome(int n) {
        int ognum=n;         //keeping copy of original number
        // int rev = 0;

        while (n > 0) {

            int lastdigit = n % 10;
            lastdigit;
            n = n / 10;
        }
        if (rev==ognum) {        //for checking here 
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (palindrome(n)) {
            System.out.println("Its palindrome.");
        } else {

            System.out.print("Not palindrome");
        }
        sc.close();
    }
}
