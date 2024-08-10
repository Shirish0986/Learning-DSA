public class ix_binarySearch {

    public static int binarysearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) { // right
                start = mid + 1;
            }
            if (num[mid] > key) { // left
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12 };
        int key = 5;
        int index = binarysearch(num, key);
        System.out.println(index);
    }
}