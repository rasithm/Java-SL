import java.util.*;
class notvalidException extends Exception{
    public notvalidException(String g){
        super(g);
    }
}
public class Throw{
    public static void main(String []args){
        Scanner user = new Scanner(System.in);
        try{
            int age = user.nextInt();
            if(age < 18){
                throw new notvalidException("your age is below 18");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}