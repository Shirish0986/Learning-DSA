import java.util.Scanner;

public class i_creation_2d_array {

    public static boolean searchkey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at index : " + "(" + i + "," + j + ")");
                }
            }
        }
        return false;
    }

    public static void largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println(largest);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        sc.close();
        int key = 10;
        System.out.println(searchkey(matrix, key));

        largest(matrix);

    }
}
