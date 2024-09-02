public class book {
    static boolean ispossible(int arr[],int n,int k,int mid)
    {
        int pagecount=0;
        int student=1;
        for(int i=0;i<n;i++)
        {
            if(pagecount+arr[i]<=mid)
            {
                pagecount+=arr[i];
            }else{
                student++;
                if(student>k || arr[i]>mid)
                {
                    return false;
                }
                pagecount=arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        arr[0]=25;
        arr[1]=46;
        arr[2]=28;
        arr[3]=49;
        arr[4]=24;
        
        
        int s=0;
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=arr[i];
        }
        int k=4;
        int n=5;
        int ans=-1;
        int e=sum;
        int mid=s+(e-s)/2;
        while(s<=e)
        {
            if(ispossible(arr,n,k,mid))
            {
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        System.out.println("Result: "+ans);
    }
}
