import java.util.Scanner;

public class pq_sum_of_Digits {
    
    public static int sum(int n) {
        int sum=0;
        while (n>0) {
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigit=sum(n);
        System.out.println("The sum of digit : " + sumofdigit);
        sc.close();
        
    }
}
