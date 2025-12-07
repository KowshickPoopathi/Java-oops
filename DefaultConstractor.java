//6

class sample{
    int roll_no ;
    String name ;
    sample(){
        System.out.println("Running default constractor");
    }
}
public class DefaultConstractor {
    public static void main(String[] args) {
        sample obj = new sample();
        obj.name = "kowshick";
}
}
