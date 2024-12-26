interface Animal{
    int age = 10;
    void speed();
    static void run(){
        System.out.println("person run");
    }
}
class Cat implements Animal{
    int age = 20;
    public void speed(){
        System.out.println("rasith");
    }
    void run(){
        System.out.println("run");
    }
} 

public class Interface{
    public static void main(String args[]){
        Cat c1 = new Cat();
        c1.speed();
        c1.run();
        System.out.println(c1.age);
    }
}