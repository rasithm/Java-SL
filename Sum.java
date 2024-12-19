public class Sum{
    String getname(String name){
    
        return name;
    }

    public static void main(String args[]){
        Sum user = new Sum();
        String total = user.getname("rasith");
        System.out.println(total);
    }
}