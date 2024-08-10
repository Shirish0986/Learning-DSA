public class reverse_the_number1 {
    public static void main(String[] args) {
        int n=90880;
        while (n>0) {   //90880>0
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;

        }
    }
}
