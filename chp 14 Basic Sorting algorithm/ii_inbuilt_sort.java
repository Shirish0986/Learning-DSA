import java.util.*;

public class ii_inbuilt_sort {

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,3,1,2};
        Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
        
        
    }

}