abstract class vehicals{
    abstract void speed();
    void brand(){
        System.out.println("xyz Brand");
    }
}
class Car extends vehicals{
    void speed(){
        System.out.println("25hr/mm");
    }
}
class Bike extends vehicals{
    void brand(){
        System.out.println("bucati");
    }
    void speed(){
        System.out.println("23");
    }
}


public class Absract{
    public static void main(String [] args){
        Bike b1 = new Bike();
        Car c1 = new Car();
        c1.speed();
        b1.brand();
        c1.brand();

    }
}