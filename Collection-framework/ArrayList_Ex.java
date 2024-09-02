import java.util.ArrayList;

public class ArrayList_Ex{
    public static void main(String[] args) {
        // 1d
        ArrayList<Integer> list=new ArrayList<>();

        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // get element
        System.out.println(list.get(2));

        // remove
        list.remove(2);
        System.out.println(list);

        // set elemet at index
        list.set(1, 10);
        System.out.println(list);

        // contain
        System.out.println(list.contains(2));
        System.out.println(list.contains(10));

        // add index
        list.add(2,2);
        System.out.println(list);

        // 
        
    }
}