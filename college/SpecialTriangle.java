import java.util.*;

public class SpecialTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the height of the triangle
        int h = scanner.nextInt();

        // Calculate the total number of elements in the triangle
        int n = h * (h + 1) / 2;

        // Input the array of numbers
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // Sort the numbers in ascending order
        Arrays.sort(numbers);

        // Construct the triangle row by row
        int index = 0;
        boolean isValid = true;

        // Iterate through each row
        for (int row = 1; row <= h && isValid; row++) {
            for (int i = 0; i < row; i++) {
                // Get the current number
                int current = numbers[index];

                // Check the numbers below the current number
                if (row < h) { // Skip the last row
                    int leftChild = numbers[index + row];
                    int rightChild = numbers[index + row + 1];

                    if (current >= leftChild || current >= rightChild) {
                        isValid = false;
                        break;
                    }
                }

                index++;
            }
        }

        // Print the result
        System.out.println(isValid ? "YES" : "NO");
    }
}