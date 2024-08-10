import java.util.Scanner;

public class pq_5_leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year%400==0 ||( year%4==0 && year%100!=0)) {
            System.out.println("its a leap");
        } else {
            System.out.println("its not a leap year");
        }
        sc.close();
    }
}
