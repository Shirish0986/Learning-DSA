public class inverted_rotated_half_pyramid {

    public static void inverHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // Spaces = (n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverHalfPyramid(4);
    }
}
