import java.util.Scanner;

public class i_input_array {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);

        marks[2] = marks[2] + 1; // updating
        System.out.println("Updated marks of maths: " + marks[2]);
        sc.close();
    }
}
