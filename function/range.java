import java.util.Scanner;

public class range{
    public static int reverse(int num)
    {
        int n=0;
        while(num!=0)
        {
            int res=num%10;
            n=n*10+res;
            num=num/10;
        }
        if(n<(-2^31) && n>((2^31)-1))
        {
            return 0;
        }else{
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your NUmber: ");
        int num=sc.nextInt();
        int res=reverse(num);
        System.out.println("Your Result is : "+res);
    }
    
}