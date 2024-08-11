public class z_binary_to_decimal {

    public static void binary_to_decimal(int n) {

        int decimal = 0;
        int pow = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            decimal = decimal +(lastdigit *(int)Math.pow(2, pow)) ;
            pow++;
            n =n/ 10;

        }
        System.out.println(decimal);

    }

    public static void main(String[] args) {
        
        binary_to_decimal(101);
    }
}