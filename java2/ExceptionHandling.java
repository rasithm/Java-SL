import java.util.*;

public class ExceptionHandling{
    public static void main(String args[]){
        try{
            Scanner user = new Scanner(System.in);
            int input = user.nextInt();
            int age = 10/0;

        }catch(Exception e){
            System.out.println("error :"+e);
        }finally{
            System.out.println("program end");
        }
    }
}