public class iv_compareString {
    public static void main(String[] args) {
        String str="shirish";
        String str1="shirish";
        String str3= new String("shirish");
        if (str==str3) {
            System.out.println("its equal");
        }else{
            
            System.out.println("its not equal");
        }
        System.out.println();
        System.out.println();
        if (str1.equals(str3)) {
            System.out.println("its equal");
        }
        
    }
}
