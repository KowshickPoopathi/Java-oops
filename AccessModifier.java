//5

//Public
//Private
//Protected
//Default

class Application{
    private int Roll_No ;
    private String Name;

    // SET function
    public void setvalue(int Roll_No , String Name){
        this.Roll_No = Roll_No;
        this.Name = Name;
    }

    //GET function
    public String getvalue(){
        return Name;
    }

    public void display(){
        System.out.println(Roll_No);
        System.out.println(Name);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Application Form = new Application();
        Form.setvalue(431234, "Kowshick");
        Form.display();
        String view = Form.getvalue();
        System.out.println( view + " It show the Get value");
    }
}
