import java.util.*;

class DivisionExample{
    void DivisionNumber(int Num , int deno){
        try{
            int result = Num/deno;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.err.println("can't divied by zero");
        }
    }
}
public class Exc{
    public static void main(String args[]){
        Scanner user = new Scanner(System.in);
        int num1 = user.nextInt();
        int num2 = user.nextInt();
        DivisionExample d1 = new DivisionExample();
        d1.DivisionNumber(num1,num2);
    }
}