public class ix_binarySearch1 {

    public static int binarysearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= num.length) {
            int mid = (start + end) / 2;
            if (key == num[mid]) {
                System.out.println("came");
                return mid;
            }
            if (num[mid] > key) {
                System.out.println("came");
                end = mid - 1;
            } else {
                System.out.println("came");
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int key = 10;
        int num[] = { 2, 4, 6, 8, 10, 12 };
        int index = binarysearch(num, key);
        System.out.println(index);
    }
}
// ======================================== Time Complexity=============================
/*
     basicall how we calculATE TIME complexity
     we see how many iteration is done ..har loop mei humne aapne array ke andar kitane baar search kiya
     
     iteration when we were in 1st iteration : tab hamare array ka size was n
     iteration when we were in 2nd iteration : tab hamare array ka size was n/2
     iteration when we were in 3rd iteration : tab hamare array ka size was n/4 
                                                                        till 1 = n/2^k ; k=(log n) [t.c]   
 */