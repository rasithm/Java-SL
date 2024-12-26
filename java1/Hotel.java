public class Hotel{


    String food;
    int price;
    String requried;
    String present;



    public static void main(String args[]){
        Hotel server1 = new Hotel();
        server1.food = "idly";
        server1.price=5;
        server1.requried="sambar";
        server1.present = "plate";

        Hotel server2 = new Hotel();
        

        System.out.println(server1.food);
        System.out.println(server2.food);
    }
}