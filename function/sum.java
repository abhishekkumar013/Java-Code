import java.util.Scanner;

public class sum{
    public static float mean(int num1,int num2) {
            float avg=(num1+num2)/2;
            return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1 & num2: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        float res=mean(num1,num2);
        System.out.print("Average is: "+res);
        // System.out.print("Average is: "+mean(num1,num2));
        
        
    }
}