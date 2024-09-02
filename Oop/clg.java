import java.util.Scanner;

class college{
  String clgname;
  String stunme;
  int roll;
 public void set_data()
 {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter College Name: ");
        clgname=sc.next();
        System.out.print("Enter student Name: ");
        stunme=sc.next();
        System.out.print("Enter Roll Number: ");
        roll=sc.nextInt();
    }
 }
 public void show()
 {
    System.out.println("College Name: "+this.clgname);
    System.out.println("Student Name: "+this.stunme);
    System.out.println("Roll Num: "+this.roll);
 }
}

public class clg {
    public static void main(String[] ags) {
        college c1=new college();
        c1.set_data();
        c1.show();
}
}