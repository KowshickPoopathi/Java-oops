//7

class sample{
    int roll_no;
    String name;
    sample(int roll_no , String name){
        this.roll_no = roll_no;
        this.name = name;
        System.out.println("Running Paramterised Constructor");
    }
}
public class ParameterisedConstructor {
    public static void main(String[] args) {
        sample obj = new sample(11111, "ADMIN");
        System.out.println(obj.roll_no);
        System.out.println(obj.name);
    }
}
