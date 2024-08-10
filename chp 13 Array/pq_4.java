public class pq_4 {
    
    public static int trappingRainwater(int height[]){
        // creating new array for leftmax bar : Max height of bar towards left
        int leftmax[]= new int[height.length];
        leftmax[0]=height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        // creating new array for rightmax bar : Max height of bar towards left
        int rightmax[]=new int[height.length]; 
        rightmax[height.length-1]=height[height.length-1];
        for (int i = height.length-2; i>=0; i--) {
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trw=0;
        // calculating trapped water
        for (int i = 0; i < rightmax.length; i++) {
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trw+=waterlevel-height[i];
        }
        return trw;
    }
    public static void main(String[] args) {
        int height[]={ 0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingRainwater(height));
    }
}
