import java.io.FileWriter;
import java.io.BufferedWriter;
public class Wrfile{
    public static void main(String args[]){
        try{
        String path = "C:\\Users\\sony\\Desktop\\java-emc\\java3File\\Demo.txt";
        FileWriter fs = new FileWriter(path,true);
        BufferedWriter bf = new BufferedWriter(fs);
        bf.write("hello world!");
        bf.newLine();
        bf.append("im rasith");
        bf.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}