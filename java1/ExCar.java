class Vehicle{
    String brand;
    int year;
    void startEngine(){
        System.out.println("start");
    }
}
class Car extends Vehicle{
    String fuelType;
    void startEngine(){
        System.out.println("Car engine start");
    }
    void driver(){
        System.out.println("Car is driver");
    }
}
class Truck extends Vehicle{
    int loadCapacity;
    void startEngine(){
        System.out.println("truck engine");
    }
    void haul(){
        System.out.println("truck is hauling");
    }
}


public class ExCar{
    public static void main(String []args){
        Car c1 = new Car();
        c1.startEngine();
        c1.driver();

        Truck t1 = new Truck();
        t1.startEngine();
        t1.haul();
    }
}