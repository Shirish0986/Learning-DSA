public class vi_reverse_array {

    public static void reversearray(int num[]){
        int start=0,end=num.length-1;
        while (start<end) {
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;  
        }
        
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        reversearray(num);
        // printing the reverse array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
// so basically we are  seeing time complexity :
//    t.c = O(n) why? we are reversing the whole array ..
// s.c= O(n) ..extra space lega extra.. sasti nhi aati market mei so .... so we able to solve it in O(1)=constant means we are not using any extra space in the memory ..jst we reverse the things in the same array which is made .. in the inout fields