import java.util.Scanner;

public class calculatesum_function1 {
    
    public static int calculatesum(int a,int b, int c){
      int sum=a+b+c;
      return sum;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=calculatesum(a,b,c);
        System.out.println(sum);


    }
}
