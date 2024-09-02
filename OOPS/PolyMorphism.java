// run time ploymorphism->methood overiding
class  A{
    void  show(){
        System.out.println("A");
    }
}
class  B extends  A{
    @Override
    void  show(){
        System.out.println("B");
    }
}
public class PolyMorphism {
    // compile time-> method overloading
    int add(int a,int b){
        return a+b;
    }
    int add(float a,float b){
        return (int)(a+b);
    }
    int add(float a,int b){
        return (int)(a+b);
    }
    int add(int a,float b){
        return (int)(a+b);
    }
    public static void main(String[] args) {
        B obj=new B();
        obj.show();

        PolyMorphism obj1=new PolyMorphism();
        
       System.out.println(obj1.add(1, 2.2f));
       System.out.println(obj1.add(1, 4));
    }
}
