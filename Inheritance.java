class A{
    int one =1;
}
class B extends A{
    int two = 2;

}
class C extends B{
    int three = 3;
}


public class Inheritance{
    public static void main(String args[]){
        C obj1 = new C();
        System.out.println(obj1.three);
        System.out.println(obj1.two);
         System.out.println(obj1.one);
    }
}