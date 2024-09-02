import java.util.Scanner;

public class add {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  num1,num2;
        System.out.println("Enter 1st Number: ");
        num1=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        num2=sc.nextInt();
        int sum=num1+num2;
        int mul=num1*num2;
        float div=num1/num2;
        System.out.println("Sum is :"+sum);
        System.out.println("Mul is :"+mul);
        System.out.println("Div is :"+div);
    }
}
