public class i_bubbleSort {

    public static void bubble_Sort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void Selection_Sort(int arr[]) {
        // Outer loop: Iterate through each element of the array
        for (int i = 0; i < arr.length - 1; i++) {
            int minposition = i; // Assume the current index is the minimum

            // Inner loop: Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minposition] > arr[j]) {
                    minposition = j; // Update the index of the minimum element
                }
            }
            // swap
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertion_sort(int arr[]) {

        // Iterate through each element starting from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            // Store the current element to be inserted
            int curr = arr[i];
            // Initialize the index of the previous element
            int prev = i - 1;

            // finding correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // Shift the greater element to the right
                prev--; // Move to the next left element

            }
            // inserting
            // Place the current element in its correct sorted position
            arr[prev + 1] = curr;
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Counting_sort(int arr[]) {

        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[]=new int[largest+1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }
        
        // Sorting step: Modify the original array based on the count array
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
            
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1,4,1,3,2,4,3,7 };
        // bubble_Sort(arr);
        Counting_sort(arr);
        System.out.println();
        // insertion_sort(arr);
        // Selection_Sort(arr);
        printArr(arr);
    }

}