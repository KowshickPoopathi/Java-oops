//14

class human{
    static int hand = 2;
    static void gender(String a){
        if(a == "m" || a == "M"){
            System.out.println("You Are the Male");
        }
        else if(a ==  "f" || a == "F"){
            System.out.println("You are the Female");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

public class Static {
    public static void main(String[] args) {
        human.gender("m");
        System.out.println(human.hand);
        //without calling the Objects
    }
}
