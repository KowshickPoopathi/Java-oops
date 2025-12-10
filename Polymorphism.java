//9

//Method Overloading

class Overload{
    int rollno = 202123;
    void name(){
        System.out.println("sample");
    }
    void name(String name){
        System.out.println(name);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Overload load = new Overload();
        load.name();
        load.name("Kowshick");
    }
}
