class papa{
    int papaprop=40;
}

class beta extends papa{
    int betaprop=20;
}
class pota extends beta{
    int potaprop=5;
}

interface  swimming{
    void swim();
}
interface Flying{
    void fly();
}
// Multiple inheritance
class  Bird implements  swimming,Flying{
    public void swim(){
        System.out.println("Bird is swimming");
    }
    public void fly(){
        System.out.println("Bird is Flying");
    }
}
class  newBird extends  Bird{
    
}
public class Inheritances {
    public static void main(String[] args) {
        // multiple
        Bird myBird=new Bird();
        myBird.fly();
        myBird.swim();

        // single
        beta mybeta=new beta();
        System.out.println(mybeta.papaprop);
        System.out.println(mybeta.betaprop);

        // multi level
        pota mypota=new pota();
        System.out.println(mypota.papaprop);
    }
}
