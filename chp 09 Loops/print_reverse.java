public class print_reverse {
    public static void main(String[] args) {
        int n = 12345;
        while (n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;
            
        }

    }
}
