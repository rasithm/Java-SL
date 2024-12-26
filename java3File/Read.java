import java.io.FileReader;
import java.io.BufferedReader;
public class Read{
    public static void main(String args[]){
        
        try{
            FileReader fs = new FileReader("Demo.txt");
            BufferedReader bf = new BufferedReader(fs);
            String line = bf.readLine();
            while(line != null){
                System.out.println(line);
                line = bf.readLine();
            }
            bf.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}