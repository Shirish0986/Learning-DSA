public class v_largestNumInArray1 {
    public static int largestInterger(int num[]){
        int largestnum=Integer.MIN_VALUE;
        for (int i = 1; i < num.length; i++) {
            if (num[i]>largestnum) {
                largestnum=num[i];
            }
            
        }
        return largestnum;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,81,10,12};
        int largest=largestInterger(num);
        System.out.println(largest);

    }
}
