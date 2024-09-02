class Stud{
    String name;
    int Roll;
    int classes;

    public void setdata(String name,int Roll,int cls)
    {
        this.Roll=Roll;
        this.name=name;
        this.classes=cls;
    }
    public void display()
    {
        System.out.println("Name: "+name+" Roll: "+Roll+" Class: "+classes);
    }
}
class teacher extends Stud
{
  String teachername;
  String fname;
  

}
public class student{
    public static void main(String args[]) {
        Stud s=new Stud();
        s.setdata("Abhi", 2105598, 4);
        s.display();
    }
}