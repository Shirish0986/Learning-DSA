import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float value = sc.nextFloat();
        System.out.print("value is : ");
        System.out.println(value);
        sc.close();
    }
}

// -----------------INT INPUT---------------------------
//         Scanner sc = new Scanner(System.in);         
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a+b);

// -----------------SENTENCE INPUT---------------------------

//         int name = sc.nextLine();
//         System.out.print("my name is : ");
//         System.out.println(name);