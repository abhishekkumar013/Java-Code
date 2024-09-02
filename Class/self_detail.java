
class Employee{
    private int id;
    private String name; 

    public void setdata(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void show_detail()
    {
        System.out.println("My Name is "+name+" with id No: "+id);
    }
}
public class self_detail {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        obj1.setdata(12, "Abhi");
        obj1.show_detail();
    }
}
