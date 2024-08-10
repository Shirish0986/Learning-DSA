import java.util.Scanner;

public class pq_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Side : ");
        int side=sc.nextInt();
        int area= side*side;
        System.out.print("Area of the Square is : ");
        System.out.println(area);
        sc.close();
    }
}
