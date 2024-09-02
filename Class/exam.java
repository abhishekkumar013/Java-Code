class Address{
    String addres;

    public String getadress(){
        return this.addres;
    }
    public void set_address(String add)
    {
        this.addres=add;
    }
}
class Homeadress extends Address{
    public String getadress(){
        return this.addres;
    }
    public void set_address(String add)
    {
        this.addres=add;
    }
}
class Officeaddress extends Address{
    public String getadress(){
        return this.addres;
    }
    public void set_address(String add)
    {
        this.addres=add;
    }
}
class schooladress extends Address{
    public String getadress(){
        return this.addres;
    }
    public void set_address(String add)
    {
        this.addres=add;
    }
}
public class exam {
    public static void main(String[] args) {
        Address ob=new Homeadress();
        Address ob1=new Officeaddress();
        Address ob2=new schooladress();
        ob.set_address("Champapur");
        System.out.println("Home -"+ob.getadress());

        ob1.set_address("Bangluru");
        System.out.println("Office -"+ob1.getadress());

        ob2.set_address("Motihari");
        System.out.println("School -"+ob2.getadress());

        // Homeadress ob3=new Address();
    }
}
