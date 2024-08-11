public class z_binary_to_decimal {

    public static void binary_to_decimal(int n) {

        int decimal = 0;
        int base = 1;
        while (n > 0) {
            int lastdigit = n % 10;
            decimal = decimal + lastdigit * base;
            base *= 2; // Move to the next power of 2
            n /= 10;
        }
        System.out.println(decimal);

    }

    public static void main(String[] args) {
        int binary = 1010;
        binary_to_decimal(binary);
    }
}