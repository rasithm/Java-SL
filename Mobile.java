public class Mobile{
    void iphone(){
        System.out.println("iphone");
    }
    void samsung(){
        System.out.println("Samsung");
    }
    void redmi(){
        System.out.println("redmi");
    }

    public static void main(String args[]){
        Mobile user = new Mobile();

        user.iphone();
        user.samsung();
        user.redmi();

    }
}