public class ii_copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shriish";
        s1.rollno = 32;
        s1.marks[0] = 20;
        s1.marks[1] = 40;
        s1.marks[2] = 50;
        s1.Password = "password";
        Student s2 = new Student(s1);

        for (int i = 0; i < 3; i++) {
            System.out.print(s2.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int rollno;
    String Password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i <marks.length; i++) {
            this.marks[i]= s1.marks[i];
        }
    
    }
    Student(){
        marks = new int[3];
    }
}
