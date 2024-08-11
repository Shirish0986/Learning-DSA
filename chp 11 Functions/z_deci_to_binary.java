public class z_deci_to_binary {

    public static void deciTobin(int n) {
        int binnum = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            binnum = binnum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println(binnum);

    }

    public static void main(String[] args) {
        deciTobin(9);

    }
}
