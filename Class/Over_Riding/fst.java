package Over_Riding;

class A{

    public int method1()
    {
        return 4;
    }
    public void method2()
    {
        System.out.println("I am method 2 from class A");
    }
}
class B extends A{
    public void method2()
    {
        System.out.println("I am method 2 from class B");
    }
    public void method3()
    {
        System.out.println("I am method 3 from class B");
    }
}
public class fst{
    public static void main(String [] args) {
        A e=new A();
        e.method2();
    }
}
