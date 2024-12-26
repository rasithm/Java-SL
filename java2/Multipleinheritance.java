interface readable{
    void read();
}
interface writeable{
    void write();
}
interface showable{
    void show();
}

class D implements readable,writeable,showable{
    public void read(){
        System.out.println("read");
    }
    public void write(){
        System.out.println("write");
    }
    public void show(){
        System.out.println("show");
    }
}


public class Multipleinheritance{
    public static void main(String args[]){
        D d = new D();
        d.read();
        d.write();
        d.show();
    }
}