public class xi_TrappingRainwater {

    public static int trappedRainwater(int height[]) {

        // Arrays to store the left maximum heights for each position
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]); // Calculate leftmax array
        }
        // Arrays to store the right maximum heights for each position
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trw = 0;

        // Loop to calculate trapped rainwater for each position
        for (int i = 0; i < height.length; i++) {

            // waterlevel = min (leftmax , rightmax)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // Calculate total trapped rainwater
            trw += waterlevel - height[i];
        }
        return trw;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));

    }
}
