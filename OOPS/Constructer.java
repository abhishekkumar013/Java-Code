import bank.*;
class  Student{
    String name;
    int age;
  
    Student(){
        System.out.println("Contructor called");
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //  Copy Constructor
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    // compile time polymorphism
    // method overloading
    public  void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public  void printInfo(int gae){
        System.out.println(age);
    }
    public  void printInfo(String name){
        System.out.println(name);
      
    }
    public  void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }


    
}
public class Constructer {
    public static void main(String[] args) {
        Student obj=new Student("Abhi",20);
        obj.printInfo();
        obj.printInfo(12);
        obj.printInfo("Arya");
        obj.printInfo("KULL", 12);

        Student obj2=new Student(obj);
        obj2.printInfo();
        // bank
        // bank.Account account=new bank.Account();
        // account.name="Account1";
        Bank newbank=new Bank();
        newbank.name="SBI";
        System.out.println(newbank.name);

    }
}
