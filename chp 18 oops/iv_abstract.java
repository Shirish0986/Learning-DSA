public class iv_abstract {
    public static void main(String[] args) {
        Horse h1= new Horse();
        h1.color();
        h1.walk();
        Mustang m1= new Mustang();

        // so here constructors are called = Animal > Horse > Mustang
    }
}
abstract class Animal {

    Animal(){
        System.out.println("animal comstructor is called....");
    }
    void color() {
        System.out.println("i  have color");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){ 
        System.out.println("horse comstructor is called....");
    }
    void walk(){
        System.out.println("yes i walk with 4 legs");
    }
}

class Mustang extends Horse{

    Mustang(){ 
        System.out.println("mustang comstructor is called....");
    }
}