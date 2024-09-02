
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass{
    public static void main(String[] args)throws Exception {
        File file=new  File("myfile.txt");
        file.createNewFile();
        System.out.println(file.exists());

        // read or write

        /* 
        FileWriter fw=new FileWriter(file);
        fw.write("hi this is abhishek Arya");
        fw.close();

        FileReader fr=new FileReader(file);
        System.out.println(fr.read());
        */

        // BufferReader/writer
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.append("Hii i am Abhi Arya");
        bw.close();

        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
    }
}