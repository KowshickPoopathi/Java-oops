//3
public class recursive {
    public static void main(String[] args) {
            Printnum(10);
    }
    public static void Printnum(int a){
        //Base Method
        if (a==1){
            System.out.println(1);
        }
        //Recursive Method
        else{
            System.out.println(a);
            Printnum(a-1);
        }
    }
}
