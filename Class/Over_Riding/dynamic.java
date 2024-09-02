// interface A{
//     void dis();
// }
final class A{
    public void dis(){
        System.out.println("This is dis");
    }
}
// class B extends A{
//     public void dis(){
//         System.out.println("This is dis");
//     }
//     public void show(){
//         System.out.println("This is show");
//     }
// }
public class dynamic {
    public static void main(String[] args) {
        A ob=new A();
        ob.dis();
        //ob.show();
    }
}
