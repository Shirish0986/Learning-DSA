public class x_Max_Subarray_sum {

    public static void maxSubarray(int num[]) {

        int maxSumArray = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int curr = 0;
                for (int k = start; k <= end; k++) {
                    curr = curr + num[k];
                }
                System.out.println("current subarray sum : " + curr);
                if (maxSumArray < curr) {
                    maxSumArray = curr;
                }
            }
        }
        System.out.println(maxSumArray);
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        maxSubarray(num);
    }
}
