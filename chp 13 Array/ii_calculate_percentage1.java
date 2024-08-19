import java.util.Scanner;

public class ii_calculate_percentage1 {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        int percent =(marks[0]+marks[1]+marks[2])/3;
        System.out.println(percent + "%");

    }
}
