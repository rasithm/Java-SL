public class Teacher{
    String markname;

    Teacher(String markname){
        this.markname = markname;
        System.out.println(markname);
    }
    public static void main(String args[]){
        Teacher t1 = new Teacher("mark");
        System.out.println(t1.markname);

    }
}