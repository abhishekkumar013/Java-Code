abstract class A{
    public void dis(){
        System.out.println("This is abstract class fun");
    }
    abstract public void greet();
}
class B extends A{
    public void greet(){
        System.out.println("Good morning");
    }
}
public class abscl {
    public static void main(String[] args) {
        B ob=new B();
        ob.dis();
        ob.greet();
    }
}
