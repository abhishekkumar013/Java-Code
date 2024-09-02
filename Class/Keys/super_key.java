package Keys;

class ekclass{
    int x;
    ekclass(int a)
    {
        this.x=a;
    }
    public int getx()
    {
        return x;
    }
}
class doclass extends ekclass{

    doclass(int z)
    {
        super(z);
        System.out.println("Mai ek constructir hu do class ka");
    }
}
public class super_key {
    public static void main(String[] args) {
        doclass e=new doclass(66);
        ekclass ob=new ekclass(5);
        System.out.println(ob.getx());
    }
}
