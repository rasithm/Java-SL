import java.util.*;

public class Find{
    int evenoradd(int num){
       if(num%2 == 0){
            System.out.println(num+"even");
            
            int even = num;
            System.out.println(even);
        }else{
            System.out.println(num+"add");
        }
        return num;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Find user = new Find();
        int userinput = input.nextInt();
        int number = user.evenoradd(userinput);
        System.out.println(number);
    }
}