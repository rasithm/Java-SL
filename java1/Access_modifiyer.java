class Teacher{
    private int salary = 10000;
    void privat(){
        System.out.println(salary);
    }
}



public class Access_modifiyer{
    public static void main(String []args){
        Teacher t1 = new Teacher();
        t1.privat();
    }
}