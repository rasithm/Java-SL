class A extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("hey mamaaaa....");
            Thread.sleep(5);
        }
        
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("oooooooo....");
            Thread.sleep(10);
        }
        
    }
}
public class Thread{
    public static void main(String []args){
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();
        a1.join();
        b1.join();
        

        a1.setPriority(10);
        b1.setPriority(5);
    }
}