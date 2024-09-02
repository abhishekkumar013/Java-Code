public class command {
    static boolean isprime(int num)
    {
        // int test=1;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num,count=0;
        boolean flag=false;
        System.out.print("Enter 5 input: ");
        for(int i=0;i<5;i++)
        {
            num=Integer.parseInt(args[i]);
            flag=isprime(num);
            if(flag)
            {
                count++;
            }
        }
        System.out.println("Total prime:"+count);

    }

}
