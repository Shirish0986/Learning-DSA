public class pq_1 {
    public static int noOf7s(int matrix[][],int key){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7}};
        int key=7;
        System.out.println(noOf7s(matrix,key));
    }
}
