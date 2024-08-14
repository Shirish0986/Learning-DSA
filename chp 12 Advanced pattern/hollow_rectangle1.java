public class hollow_rectangle1 {
    public static void hollowRectangle(int rows, int columns) {
        // outer Loop -rows
        for (int i = 1; i <= rows; i++) {
            // inner loop -columns
            for (int j = 1; j <= columns; j++) {
                // cell - (i,j)
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollowRectangle(4, 5);
    }
}
