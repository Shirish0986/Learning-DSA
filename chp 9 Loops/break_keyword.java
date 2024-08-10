import java.util.Scanner;

public class break_keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the Number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
            
        } while (true);
        sc.close();
    }
}
