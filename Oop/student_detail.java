import java.util.Scanner;

class Student{
    String name;
    int roll;
    /**
     * 
     */
    Student(String n,int r)
    {
        this.name=n;
        this.roll=r;
    }
    public void detail()
    {
        System.out.println("Name of student is : "+name);
        System.out.println("Roll is : "+roll);
    }

}
public class student_detail{
    public static void main(String[] ags) {
        Scanner sc=new Scanner(System.in);
        Student student1=new Student("Abhi",210);
       // student1.name="Abhishek";
        //student1.roll=2105598;
        student1.detail();
       
        
    }
}