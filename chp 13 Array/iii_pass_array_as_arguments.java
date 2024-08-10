
public class iii_pass_array_as_arguments {

    public static void update(int marks[], int unchangeable) {
        unchangeable=25;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 24, 35, 67 };
        int unchangeable = 23;
        update(marks, unchangeable);

        // printing the marks here
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // unchangeable value
        System.out.println(unchangeable);

    }
}
