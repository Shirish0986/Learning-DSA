public class viii_print_subarray1 {

    public static void printsubarray(int num[]) {

        // Outer loop
        for (int i = 0; i < num.length; i++) {
            int start = i; // current start index

            // Inner loop to iterate over all possible ending indices
            for (int j = i; j < num.length; j++) {
                int end = j; // current ending index

                // Loop to print the elements of the current subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " "); // Print each element followed by a space
                }
                System.out.println(); // Move to the next line after printing the subarray
            }
            System.out.println(); // Add an extra line for better readability between different subarrays

        }

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printsubarray(num);
    }
}
