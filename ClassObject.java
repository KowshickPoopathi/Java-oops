//4
public class ClassObject {
    String name;
    int roll_no;
    public void display(){
        System.out.println(name);
        System.out.println(roll_no);
    }
    
    public static void main(String[] args) {
        ClassObject Form = new ClassObject();
        Form.name = "kowshick";
        Form.roll_no = 12334;
        Form.display();

        ClassObject admin = new ClassObject();
        admin.name = "ADMIN";
        admin.roll_no = 11111;
        admin.display();

    }
}
