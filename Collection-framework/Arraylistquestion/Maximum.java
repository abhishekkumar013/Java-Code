// package Arraylistquestion;
import java.util.ArrayList;

public class Maximum {
   public static void main(String[] args) {
         // 1d
         ArrayList<Integer> list=new ArrayList<>();

         // add
         list.add(1);
         list.add(12);
         list.add(3);
         list.add(4);
         list.add(0);

         int max=Integer.MIN_VALUE;

         for(int i=0;i<list.size();i++){
                if(max<list.get(i)){
                    max=list.get(i);
                }
         }

         System.out.println("Max Value in Array : "+max);
//  2nd method
         int max2=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max2=Math.max(max2, list.get(i));
        }
        System.out.println("Max Value in Array : "+max2);


   } 
}
