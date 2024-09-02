import  java.util.*;
public class First {
    public static void main(String[] args) {
        List ll=new LinkedList<Integer>();
        ll.add(12);
        ll.add(13);
        System.out.println(ll);

        LinkedList<Integer> ll2=new LinkedList<>();
        ll2.add(15);
        ll2.add(16);
        ll2.add(17);
        ll2.add(18);
        
        System.out.println(ll2);
        // remove
        ll2.remove(1);
        System.out.println(ll2);

    }
}
