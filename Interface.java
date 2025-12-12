//13 
interface Father{
    abstract void height();
}
interface Mother{
    abstract void talk();
}

class Son implements Father,Mother{
    public void height(){
        System.out.println("Height Same like the Father");
    } 
    public void talk(){
        System.out.println("Talk Same like a the Mother");
    }
}
public class Interface {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.height();
        obj.talk();
    }
}
