interface D{
    void run();
}
public class Lamda{
    public static void main(String args[]){
        D obj = () -> {
            System.out.println("Lamda");
        };
        obj.run();
    }
}