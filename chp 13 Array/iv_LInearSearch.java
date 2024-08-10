public class iv_LInearSearch {

    public static int linearsearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12 };
        int key = 10;
        int index = linearsearch(num, key);
        if (index == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at index : " + index);
        }

    }
}
