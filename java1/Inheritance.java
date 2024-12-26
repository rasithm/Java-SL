class A{
    void run(){
        System.out.println("person run");
    }
}

class B extends A{
    void eat(){
        System.out.println("person eat");
    }
}
class C extends A{
    void jump(){
        System.out.println("person jump");
    }
}

public class Inheritance{
    public static void main(String [] args){
        C obj1 = new C();
        obj1.jump();
        obj1.eat();
        obj1.run();
    }
}