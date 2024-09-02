class triangle{
    float a;
    float b;
    float c;
    float area;
    float peri;
    public void set_dem(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    boolean is_triangle(){
        if(this.a<(this.b+this.c))
        return true;
        else
         return false;
    }
    public float find_area()
    {
         area=(0.5f*this.a*this.b);
        
    }
    public float find_perimeter(){
         peri=a+b+c;
        
    }
    public void show(){
        System.out.println("Area="+this.area+"\n"+"Peirmeter="+this.peri);
    }
}

public class q1 {
    public static void main(String[] args) {
        triangle obj=new triangle();
        obj.set_dem(3, 4, 8);
        obj.find_area();
        obj.find_perimeter();

    }
}
