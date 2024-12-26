abstract class vehical{
    final void startEngine(){
        System.out.println("Engine Start..");
    }
    static String getVehicalType(){
        return "generic vehical";
    }
    abstract void drive();
}

class Car extends Vehical{
    void drive(){
        System.out.println("Drive car");
    }
}

class Bike extends Vehical{
    void drive(){
        System.out.println("Drive a bike");
    }
}

public class ExcFinalkw2{
    public static void main(String []args){
        Car c1 = new Car();
        c1.drive();
        system.out.println(Vehical.getVehicalType());
    }
}