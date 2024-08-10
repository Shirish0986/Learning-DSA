public class butterfly_practice {

    public static void butterlfy_pattern_practice(int n) {
        for (int i = 1; i <= n; i++) {
            // first half
            // star =i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces =2*(n-1)
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print(" ");
            }

            // star=i
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                               
            }
            System.out.println(); 
        }

        for (int i = n; i <= n; i) {
            //second half
            // star =i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces =2*(n-1)
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print(" ");
            }

            // star=i
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                               
            }
            System.out.println(); 
        }


        
    }

    public static void main(String[] args) {
        butterlfy_pattern_practice(5);
    }
}
