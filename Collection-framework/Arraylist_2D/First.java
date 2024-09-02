// package Arraylist_2D;
import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();

        // 
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        list2.remove(3);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currrentList=mainList.get(i);

            for(int j=0;j<currrentList.size();j++){
                System.out.print(currrentList.get(j)+" ");
            }
            System.out.println();
        }

// for each loop
        for(ArrayList<Integer> i:mainList){
            // ArrayList<Integer>currrentList=i;

            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // 
        for(var i:mainList){
            // ArrayList<Integer>currrentList=i;

            for(var j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
