//12 
abstract class OS{
    abstract void sample();
}

class linux extends OS {
    void sample(){
        System.out.println("Linux is better forever");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        linux master = new linux();
        master.sample();
    }
}
