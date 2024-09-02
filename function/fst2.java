//import java.util.function.*;
import java.util.Scanner;

public class fst2{
    public static void mean(int num1,int num2) {
        int men=(num1+num2)/2;
        System.out.print("Mean of Num is : ");
        System.out.println(men);
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Num1: ");
    int num1=sc.nextInt();
    System.out.print("Enter Num2: ");
    int num2=sc.nextInt();
        mean(num1,num2);
   }
    
}