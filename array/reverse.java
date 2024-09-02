
public class reverse{
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int l=arr.length;
        int n=Math.floorDiv(l, 2);
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Sum of first 20 natural num="+sum(20));
    }
}