public class Constator{
    int mark;
    String name;
    Constator(int a , String b){
        System.out.println("const");
        mark = a;
        name = b;
    }

    public static void main(String args[]){
        Constator user1  = new Constator(35,"Rasith");
        System.out.println(user1.name);
        System.out.println(user1.mark);
        Constator user2 = new Constator(45,"sanjai");
        System.out.println(user2.name);
        System.out.println(user2.mark);

    }
}