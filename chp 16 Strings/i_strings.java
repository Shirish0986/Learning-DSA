import java.util.Scanner;

class i_strings {

    public static void printletters(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("now its length");
        System.out.println(str1.length());
        System.out.println("now at index 2 ");
        System.out.println(str1.charAt(1));
        sc.close();
        str1 = "Shirish Singh";
        printletters(str1);

    }
}