
import java.util.Scanner;

public class addition {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter Num1 & Num2: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is : "+sum);
        
    }
    
}
