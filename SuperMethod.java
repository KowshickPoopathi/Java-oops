//16


class Father{
    String name = "God Father";
    void Tester(){
        System.out.println(name);
    }
}
class Son extends Father{
    String name = "Good Father";
    void Executer(){
        System.out.println(super.name);
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        Father obj1 = new Father();
        Son obj2 = new Son();
        obj1.Tester();
        obj2.Executer();
    } 
}
