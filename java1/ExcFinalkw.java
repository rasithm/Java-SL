// class Person{
//     public String name;
//     protected int age;
//     // private String socialSecurityNumber;
//     String address;

//     Person(String name , int age , String address ){
//         this.name = name;
//         this.age = age;
//         this.address = address;
//         // this.socialSecurityNumber = snn;
//     }
// }
// class Employee extends Person{
//     Employee(String name , int age , String address ){
//        super(name , age , address);
//        System.out.println("Employee"); 
//     }
// } 




public class ExcFinalkw{
    public static void main(String args[]){
        Employee e1 = new Employee("rasith" , 23 , "vadaka" );
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.address);
        // System.out.println(e1.snn);
    }
}