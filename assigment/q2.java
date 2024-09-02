import java.util.Scanner;

class shape{
    float dim1;
    float dim2;
    shape(float l,float b)
    {
        this.dim1=l;
        this.dim2=b;
    }
}
class triangle extends shape{
    triangle(float l,float b)
    {
        super(l, b);
    }
    public void findArea()
    {
        float area=0.5f*this.dim1*this.dim2;
        System.out.println("Area of triangle="+area);
    }
}
class rectangle extends shape{
    rectangle(float l,float b)
    {
        super(l,b);
    }
    public void findArea(){
        float area=this.dim1*this.dim2;
        System.out.println("Area of rectangle="+area);
    }
}
public class q2 {
    public static void main(String[] args) {
        float l,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base of triangle:");
        b=sc.nextInt();
        System.out.print("Enter height of triangle:");
        l=sc.nextInt();
      triangle obj1=new triangle(l, b);
      obj1.findArea();

      System.out.print("Enter length of rectangle:");
        b=sc.nextInt();
        System.out.print("Enter width of rectangle:");
        l=sc.nextInt();
      rectangle obj2=new rectangle(l, b);
      obj2.findArea();
    }
}
