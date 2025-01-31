public class i_oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // constructor // created a pen object called p1
        p1.Setcolor("blue");
        System.out.println(p1.Getcolor());
        p1.Setcolor("yellow");
        System.out.println(p1.Getcolor());
        Bankacc myacc = new Bankacc();
        p1.SetTip(5);
        System.out.println(p1.GetTip());
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

    int GetTip(){
        return this.tipsize;
    }
    void Setcolor(String color) {
        this.color = color;
    }

    void SetTip(int tipsize) {
        this.tipsize = tipsize;
    }
}

// class Bankacc {
//     public String username;
//     private String password;

//     public String setpassword(String newpassword){
//         password=newpassword;
//     }

// }