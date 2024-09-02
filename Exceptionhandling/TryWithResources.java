import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
    public  static void myfile()throws Exception{
        System.out.println("h");
    }
    // public static void main(String[] args)throws  Exception {
        public static void main(String[] args) {
        // Use try-with-resources for automatic resource management
        try (FileReader fr = new FileReader("abc.txt");
             BufferedReader br = new BufferedReader(fr)) {
             
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            // Catching IOException which is more specific than Exception
            System.out.println(e); 
        }

        Scanner scan=new Scanner(System.in);
        try(scan){
            System.out.println('a');
            throw new Exception("hhhhh");
        }catch(Exception e){
            System.out.println(e);
        }      
        
        
    }
}
