import java.util.Scanner;

public class Search_array {
    /**
     * @param args
     */
    public static void search_element(int []arr,int num,int n) {
        boolean test=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                test=true;
            }
        }
        System.out.println("The Number "+num +" You Search in array is present is : "+test);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Size of array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter element of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Num whic you want to search: ");
        int num=sc.nextInt();
        search_element(arr,num,n);
        
    }
}
