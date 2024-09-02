class pen{
 String   colour;
 String type;
 public void write()
 {
    System.out.println("Wrting something");
 }
 public void print()
 {
    System.out.println(colour);
    System.out.println(type);
 }
}
public class fst{
    public static void main(String[] ags) {
        pen pen1=new pen();
        pen1.colour="Blue";
        pen1.type="Ink";
        pen1.write();
        pen1.print();
    }

}