
class Animal{
    int legs;
    void eats(){
        System.out.println("Eating .......");
    }

}


class  Empployee{
    private int empId;
    private String  empName;

    void setEmployeeId(int id){
        this.empId=id;
    }
    void setEmployeeName(String name){
        this.empName=name;
    }
    int getEmployeeId(){
        return empId;
    }
    String getEmployeename(){
        return empName;
    }


}
public class Basic{
    public static  void  main(String[] args){
        // object creation
            Animal obj=new Animal();
            obj.eats();

            obj.legs=4;
            System.out.println(obj.legs);

            Empployee emp=new Empployee();
            emp.setEmployeeId(1);
            emp.setEmployeeName("ABHI");
            System.out.println(emp.getEmployeeId());
            System.out.println(emp.getEmployeename());

    }
}