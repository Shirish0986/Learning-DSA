public class v_largestNumInArray {

    public static int getlargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest =num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = { 1, 2, 6, 3, 5 };
        int largest =getlargest(num);
        System.out.println("The largest Number is " + largest + " in an Given Array.");
    }
}
