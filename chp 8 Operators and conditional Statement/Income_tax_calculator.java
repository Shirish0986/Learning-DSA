import java.util.Scanner;

public class Income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary= sc.nextInt();
        
        if(salary<500000)
        {
            System.out.println("no tax");
        }
        else if(salary>=500000 && salary<=1000000){
            float tax=salary*0.2f;
            System.out.println("Salary with tax is : "+tax);  
        }
        else{
            float tax=salary*0.3f;
            System.out.println("Salary with tax is : "+tax);  
        }
        sc.close();
    }
}