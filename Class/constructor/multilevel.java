
// abstract class A{
//     A(int l,int b){
//         System.out.println("A"+l+" "+b);
//     }
// }
// class B extends A{
//     B(int l,int b,int h){
//         super(l, b);
//         System.out.println("B"+h);
//     }
// }
// class C extends B {
//     C(int l,int b,int h,int t){
//         super(l, b, h);
//         System.out.println("C"+t);
//     }
// }
class A{
  A(){

  }
}
class B extends A{
    B(int a){

        System.out.println("B"+a);
    }
}
 class multilevel {
    public static void main(String[] args) {
        B ob=new B(2);
        // B ob1=new B();
    }
}
