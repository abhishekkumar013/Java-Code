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
    @Override
    public void method2()
    {
        System.out.println("I am method 2 from class B");
    }
    public void method3()
    {
        System.out.println("I am method 3 from class B");
    }
}
public class overdingf {
    public static void main(String [] args) {
        // A e=new A();
        // e.method2();
        // B f=new B();
        // f.method2();
        A obj=new B();
        obj.method2();
    }
}
