import java.util.Scanner;

public class pq_3_withGST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pen Cost : ");
        float pen = sc.nextFloat();
        System.out.print("Enter pencil Cost : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter Earser Cost : ");
        float earser = sc.nextFloat();
        float totalprice = pen + pencil + earser;
        float GST = totalprice * 0.18F;
        Float FinalPrice = totalprice + GST;
        System.out.print("Final Price of items with GST : ");
        System.out.println(FinalPrice);

        sc.close();
    }
}
