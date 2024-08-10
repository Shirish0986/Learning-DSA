import java.util.Scanner;

public class Sum_of_1st_natural_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i,sum=0;
        for ( i = 1; i <= n ; i++) {
            sum+=i;
            sc.close();

        }
        System.out.println(sum);
    }
}
