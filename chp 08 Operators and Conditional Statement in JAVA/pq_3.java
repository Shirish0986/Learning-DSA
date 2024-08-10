import java.util.Scanner;

public class pq_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of week{1 to 7} : ");
        int nweek = sc.nextInt();
        switch (nweek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;    
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;    
            case 6:
                System.out.println("Saturday");
                break; 
            case 7:
                System.out.println("Sunday");
                break;       
            default:  
                System.out.println("Wrong Input ");
                break;
        }
        sc.close();
    }
}
