// class Laptop{
//     String name = "hp";
// }
// class Bike{
//     int price = 10;
// }

class Dad{
    int cash = 2000;
}
class Son extends Dad{

}


public class Manyclass{
    public static void main(String []args){
        // Laptop l1 = new Laptop();
        // Bike b1 = new Bike();
        // System.out.println(l1.name);
        // System.out.println(b1.price);
        Son s1 = new Son();
        System.out.println(s1.cash);

    }
}