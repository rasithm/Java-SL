class Student{
   static String teacher = "rasith";
}
public class Static{
    static{
        System.out.println("anjuman");
    }
    public static void main(String []args){
        Student.teacher = "sudha";
        System.out.println(Student.teacher);

    }
}