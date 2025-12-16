class Father{
    int age;
    String name;
    void Input(int age, String name ){
        this.age = age;
        this.name = name;
        System.out.println(name + " Age is " + age);
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        Father obj = new Father();
        obj.Input(20, "Kowshick");
    }
}
