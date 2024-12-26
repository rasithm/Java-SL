class exception{
    void run() throws  Exception
    {
        int age = 2/0;
    }
}
public class Custhrow{
    public static void main(String args[]){
        exception e1 = new exception();
        try{
            e1.run();
            System.out.println("without error");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}