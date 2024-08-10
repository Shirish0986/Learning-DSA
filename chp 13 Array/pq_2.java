public class pq_2 {

    public static int binarysearch(int nums[], int target) {

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // check if right half is sorted
            if (nums[mid] <= target && nums[mid+1]>target) {
                start = mid + 1; //right
            }
            if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[] = { 7, 8, 9, 1,2,3, 4, 5, 6 };
        int target = 1;
        int index = binarysearch(nums, target);
        System.out.println(index);
    }
}
