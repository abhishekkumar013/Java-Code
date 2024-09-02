import java.util.Scanner;
class dost{
  int mob;
  String name;

  public void setdata(int mob,String name){
    this.mob=mob;
    this.name=name;
  }
  public void display()
  {
    System.out.print("Name: "+this.name+"\n"+"Mob No: "+this.mob);
  }
  public String getname()
  {
    return this.name;
  }
  public int getmob()
  {
    return this.mob;
  }
}
public class Apna {
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        dost frnd1=new dost();
        frnd1.setdata(68905698, "dhiraj");
        frnd1.display();
    }
}
