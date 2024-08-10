public class pq_1 {

    public static boolean checkrepeatingtwice(int num[]) {
        for (int i = 0; i <= num.length - 1; i++) {
            // int start = num[i]; // no need to take variable again
            for (int j = i + 1; j <= num.length - 1; j++) {
                // if (start == num[j]) { // we can directly check : num[i] ==num[j]
                // return true;
                // }
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = { 1, 3, 3, 5, 6, 7 };
        System.out.println(checkrepeatingtwice(num));
    }
}
