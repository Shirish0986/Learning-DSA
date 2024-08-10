public class pq_4_functions {
    public static void maxmin(int a, int b) {
        System.out.print("The maximum value: " + Math.max(a, b));
        System.out.println();
        System.out.print("The minimum value: " + Math.min(a, b));
        System.out.println();
        
    }

    public static void sqrtroot(int a) {
        System.out.print("The square value: " + Math.sqrt(a));
        System.out.println();
    }
    public static void power(int a,int b) {
        System.out.println("The pow value: " + Math.pow(a,b));
    }
    public static void abs(int a) {
        System.out.println("The abs value: " + Math.abs(a));
    }

    public static void main(String[] args) {
        int a = 16;
        int b = -4;
        maxmin(a, b);
        sqrtroot(a);
        power(a, b);
        abs(b);
    }
}
