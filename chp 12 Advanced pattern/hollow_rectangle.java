public class hollow_rectangle {
    
    public static void hollowrec(int totrows,int totcols) {
        
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i==1 || j==1 || i==totrows || totcols==j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowrec(4, 5);
        
    }
}
