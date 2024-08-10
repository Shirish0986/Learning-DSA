import java.util.Scanner;

public class pq_2_sumof_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumeven = 0;
        int sumodd = 0;
        int choice;
        do {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sumeven += n;
            } else {
                sumodd += n;
            }
            System.out.println("Enter 1 to continue or 0 to exit");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("the sum of even is : " + sumeven);
        System.out.println("the sum of odd is : " + sumodd);
        sc.close();
    }
}
