import java.util.Scanner;

public class continue_keyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to be checked its multiple of 10: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num % 10== 0) {
                System.out.println("The number entered is the multiple of 10 i.e : " +num );
                continue;
            }
            System.out.println("Entered Number is not multiple of 10: " + num);
        }

        scanner.close();
    }
}
