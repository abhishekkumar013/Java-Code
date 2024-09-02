package classWork;
import java.util.Scanner;

class armstn{
        int num;
        int onum;
        int rem;
        int res;

        armstn()
        {
          res=0;
        }
        public void check()
        {
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            onum=num;
            while(onum!=0)
            {
                rem=onum%10;
                res+=Math.pow(rem,3);
                onum/=10;
            }
            if(res==num)
            {
                System.out.println("Number Is Armstrong");
            }else{
                System.out.println("Number Is Not Armstrong");
            }
        }
    }
class febonum{
        int term;
        int a;
        int b;
        int sum;
        febonum()
        {
            a=0;
            b=0;
            sum=0;
        }
        public void  displayfeb()
        {
            Scanner sc=new Scanner(System.in);
            term=sc.nextInt();
            for(int i=0;i<=term;i++)
            {
                System.out.print(a+" ");
                sum=a+b;
                b=sum;
                a=b;
            }
        }
}
public class armstrong {
    public static void main(String args[])
     {
        armstn obj2=new armstn();
        obj2.check();

        febonum obj=new febonum();
        obj.displayfeb();
      }
}
