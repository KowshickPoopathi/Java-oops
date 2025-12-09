//8

class Animal{
    int legsno = 4;

    void eat(){
        System.out.println("I can eat");
    }

    void walk(){
        System.out.println("I can walk");
    }

}

class dog extends Animal{
    boolean canbark = true ;
}

public class Inheritance{
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.eat();
        obj.walk();
        System.out.println(obj.legsno);

        dog obj1 = new dog();
        obj1.eat();
        obj1.walk();
        System.out.println(obj1.legsno);
    }
}
