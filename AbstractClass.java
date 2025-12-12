//11
abstract class OS {
   void install(){
    System.out.println("Operating System");
   }
}
class Linux extends OS{
    String ram = "I am using Less Memory";
    void install(){
        System.out.println(ram);
    }
}
class Windows extends OS {

}
class Mac extends Linux{
    String ram = "I am using SOC";
}
public class AbstractClass {
    public static void main(String[] args) {
        Linux iso = new Linux();
        iso.install();
        Windows better = new Windows();
        better.install();
        Mac worst = new Mac();
        worst.install();
    }
}
