class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animals make sounds");
    }
    
}
class Dog extends Animal{
    String breed;
    void makeSound(){
        System.out.println("Woow woow");
    }
    void fetch(){
        System.out.println("ootha");
    } 
}
class Cat extends Animal{
    String color;
    void makeSound(){
        System.out.println("meow");
    }
    void climb(){
        System.out.println("Cat Climmbing");
    }
}

public class Zoo{
    public static void main(String main[]){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.name = "dhonki";
        dog.age = 2;
        dog.breed = "golden";
        dog.makeSound();
        dog.fetch();

        cat.makeSound();
        cat.name = "boose";
        cat.age = 2;
        cat.color = "white";
        cat.makeSound();
        cat.climb();
    
    }
}