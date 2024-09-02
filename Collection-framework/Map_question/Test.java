import java.util.HashMap;
import java.util.TreeMap;


public class Test {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1, 10);
        map.put(1, 20);
        map.put(2, 100);
        map.put(3, 200);
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.keySet());
        System.out.println(map.values());

        // sorted key
        TreeMap<Integer,Integer>tmap=new TreeMap<>();
        tmap.put(1, 10);
        tmap.put(1, 20);
        tmap.put(2, 100);
        tmap.put(3, 200);
        System.out.println(tmap);
        System.out.println(tmap.get(2));
        System.out.println(tmap.keySet());
        System.out.println(tmap.values());
    }
}
