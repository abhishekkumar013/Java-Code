class outer{
    public void show(){
        System.out.println("Outer method");
    }
    class inner{
        public void inshow(){
            System.out.println("inner method");
        }
    }
}
public class loop {
    public static void main(String[] args) {
        outer ob=new outer();
        ob.show();
    //    ob.inner=new outer.iner();
    outer.inner ob2=new outer().new inner();
    
    //ob2.show();
    ob2.inshow();
    }
}
