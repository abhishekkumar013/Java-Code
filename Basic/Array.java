
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // 
        int arr[]={1,2,3,4,5};
        System.out.println(arr[2]);
        //  
        int[] myarr={1,2,3,4,6};
        System.out.println(myarr[4]);

        // 2d Arrayy
        int [][] twoD={{1,2,3,4},{5,6,7,8}};
        System.out.println(twoD[1][3]);

        // 3d
        int [][][] threeD={{{10},{30,40}},{{50,60}}};
        System.out.println(threeD[0][0][0]);
        System.out.println(threeD[0][1][0]);
        System.out.println(threeD[0][1][1]);
        System.out.println(threeD[1][0][1]);

        // Dynamic Array
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size=scan.nextInt();
        int arr2[]=new int[size];
       
        for(int i=0;i<arr2.length;i++){
            System.out.print("Enter Array Value: ");
            int val=scan.nextInt();
            arr2[i]=val;
        }
        for(int a:arr2){
            System.out.print(a+" ");
        }



    }
}
