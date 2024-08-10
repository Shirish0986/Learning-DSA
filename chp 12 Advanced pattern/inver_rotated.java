public class inver_rotated {

    public static void hollowrec(int totrows, int totcols) {

        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || j == 1 || i == totrows || totcols == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

    public static void InRoPy(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    

    public static void main(String[] args) {
        InRoPy(5);
        System.out.println();
        hollowrec(5,4);
    }
}
