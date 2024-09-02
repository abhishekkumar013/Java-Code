// package Vector_CF;
import   java.util.Vector;
public class Test {
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<>();
        vec.add(12);
        vec.add(13);
        vec.add(14);
        vec.add(15);
        
        System.out.println(vec);
        // remove
        vec.remove(3);
        System.out.println(vec);

    }
}
