package Class;

import java.util.Scanner;
class vechile{
    public String Model;
    
    public vechile(String model)
    {
        this.Model=model;
    }
    public void show()
    {
        System.out.println("Model "+this.Model);
    }

}
class carn extends vechile{
 
    public String color;
    public int price;
    public carn(String color,int price,String model)
    {
        super(model);
        this.price=price;
        this.color=color;
    }
    
    public void displaycarn()
    {
        System.out.println("Color "+this.color);
        System.out.println("Model "+this.Model);
        System.out.println("Price "+this.price);
    }
}
public class car{   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter Car price: ");
        int p=sc.nextInt();
        System.out.print("Enter Car Color: ");
        String c=sc.nextLine();
        System.out.print("Enter Car Model: ");
        String m=sc.nextLine();
        vechile newv=new vechile(m);
        carn newc=new carn(c,p,m);
        newv.show();
        newc.displaycarn();
    }
}
