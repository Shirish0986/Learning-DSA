public class iii_inheritance {
    public static void main(String[] args) {
       Fish shark = new Fish();
       shark.eat();  
    }
}

class Animal {
    void eat(){
        System.out.println("yes it eats");
    }
    void legs(){
        System.out.println("yes i have legs");
    }
    void color(){
        System.out.println("yes i have colors");
    }
}

class Fish extends Animal{
    void fings(){
        System.out.println("i have 2 wings");
    }
}