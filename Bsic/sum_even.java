import java.util.Scanner;

public class sum_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enetr Num: ");
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("Sum of N even is: "+sum);
    }
    
}
