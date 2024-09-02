
import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        // print
        System.out.println(al);
        // each value
        for(int i:al){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
