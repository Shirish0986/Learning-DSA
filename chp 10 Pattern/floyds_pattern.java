public class floyds_pattern {
    public static void main(String[] args) {
        int n = 5;
        int print_no=1;     // this we are going to print 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(print_no + " ");
                print_no++;
            }
            System.out.println();
        }
    }
}
