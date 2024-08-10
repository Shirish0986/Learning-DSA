public class star_pattern {
    public static void main(String[] args) {
        int n=10;
        for (int line = 1; line <=n; line++) {     // outer loop is for : no. of line i.e (4 line)
            for (int star = 1; star <=line; star++) {    // inner loop is for : no. of times we are going to print 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
