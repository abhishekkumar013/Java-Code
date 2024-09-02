import java.util.Scanner;

public class factorial {
    /**
     * @param num
     * @return
     */
    public static int get_factorial(int  num) {
        int fact=1;
        for(int i=num;i>1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=sc.nextInt();
        int res=get_factorial(num);
        System.out.println("Factorial of "+num +" is : "+res);
        
    }
}
