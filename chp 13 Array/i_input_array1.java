import java.util.Scanner;

public class i_input_array1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int marks[]= new int[50];

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println("Marks of Subjects 1: " + marks[1]);
        marks[1]+=2;
        System.out.println("Updated Marks:"+ marks[1]);
    }
}
