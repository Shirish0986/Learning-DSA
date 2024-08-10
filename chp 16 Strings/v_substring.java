public class v_substring {

    public static String SubString(String str,int strt,int end){
        String SubStringg="";
        for (int i = strt; i < end; i++) {
            SubStringg=SubStringg+str.charAt(i);
        }
        return SubStringg;
    }
    public static void main(String[] args) {
        String str="Hello world";
        System.out.println(str.substring(0, 9));
        
        // System.out.println(SubString(str,0,7));
    }
}
