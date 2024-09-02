class Animal{  
    void eat(){System.out.println("eating");}  
    }  
class Dog extends Animal{  
    void eat(){System.out.println("eating fruits");}  
    }  
class BabyDog extends Dog{  
    void eat(){System.out.println("drinking milk");}  
    }
public class test {
    public static void main(String arg[])
{ 
    Animal a1,a2,a3;  
   a1=new Animal();  
  a2=new Dog();  
  a3=new BabyDog();  
  a1.eat();  
   a2.eat();  
  a3.eat();  
    // BabyDog ob=new BabyDog();
    // ob.eat();
}
}
