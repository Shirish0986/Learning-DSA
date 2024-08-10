public class pq_2 {
    public static void sumof2ndRow(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");

            }
            System.out.println();
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + "  ");

            }
            System.out.println();
        }
        
            
       
    }
    
    

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 } };
        sumof2ndRow(matrix);
    }
}
