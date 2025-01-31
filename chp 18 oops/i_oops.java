public class i_oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // constructor // created a pen object called p1
        p1.Setcolor("blue");
        System.out.println(p1.Getcolor());
        p1.Setcolor("yellow");
        System.out.println(p1.color);
        Bankacc myacc = new Bankacc();
        myacc.username = "shirish0986";
        System.out.println(myacc.username);
        // myacc.setpassword("shirish0986");
    }

}


class Pen {
    private String color;
    private int tipsize;

    String Getcolor(){
        return this.color;
    }
    void Setcolor(String color) {
        this.color = color;
    }

    void ChangeTip(int newtipsize) {
        tipsize = newtipsize;
    }
}

// class Bankacc {
//     public String username;
//     private String password;

//     public String setpassword(String newpassword){
//         password=newpassword;
//     }

// }