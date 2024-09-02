import java.util.*;
class base{
    int x;
    int y;
    base()
    {
        System.out.println("Constructor Called");
    }
    public void setval(int a,int b)
    {
        x=a;
        y=b;
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public void res() {
        int mul=x*y;
        System.out.println(mul);
        
    }
}
class drive extends base{
    String name;
    int Roll;
    drive()
    {
        System.out.println("Drive cons called");
    }
    drive(String nam,int roll)
    {
        name=nam;
        Roll=roll;
    }
    public void display() {
        System.out.println(name);
        System.out.println(Roll);
    }
}
public class fst
{
    public static void main(String args[]) {
        base b1=new base();
        b1.setval(2, 3);
        System.out.println(b1.getx());
        b1.res();
        drive d1=new drive("Abhi",2105);
        // d1("Abhi",21055);
        d1.display();
        
    }
}