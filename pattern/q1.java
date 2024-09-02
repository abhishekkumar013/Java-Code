import java.util.Scanner;

/* 1234554321
   1234**4321
   123****321
   12******21
   1********1 */

public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input: ");
        int num=sc.nextInt();
        int i=0;
        while(i<num)
        {
            int j=1;
            while(j<=num-i)
            {
                System.out.print(j+" ");
                j++;
            }
            int k=0;
            while(k<i*2)
            {
                System.out.print("* ");
                k++;
            }
            int l=num-i;
            while(l>=1)
            {
                System.out.print(l+" ");
                l--;
            }
            System.out.println();
            i++;
        }
    }
}