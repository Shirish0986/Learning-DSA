public class iv_LInearSearch1 {
    public static int LinearSearch(int nums[],int key){
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==key) {
                System.out.println(i);
            } 
        }
        return -1;

    }
    public static void main(String[] args) {
        int key=10;
        int nums[]={2,4,6,8,10,12,14};
        LinearSearch(nums,key);
    }
}
