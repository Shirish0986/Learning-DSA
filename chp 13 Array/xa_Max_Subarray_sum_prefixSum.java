public class xa_Max_Subarray_sum_prefixSum {

    public static void prefixsum(int num[]) {
        int prefix[] = new int[num.length];   // new Array to store the prefix sums

        // calculate the prefix array:
        prefix[0] = num[0];    // The first element of the prefix array is the same as the first element of the original array

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];  // Calculate the prefix sum for each
        }
        int maxSumArray = Integer.MIN_VALUE;   // Variable to store the maximum subarray sum

        // Outer loop
        for (int i = 0; i < num.length; i++) {
            int start = i;

            // Inner loop
            for (int j = i; j < num.length; j++) {
                int end = j;
                
                // Calculate the current subarray sum using prefix sums
                int currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSumArray < currsum) {
                    maxSumArray = currsum;
                }
            }
        }
        System.out.println(maxSumArray);
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        prefixsum(num);
    }
}
