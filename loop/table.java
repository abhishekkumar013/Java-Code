import java.util.Scanner;

public class table {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num=sc.nextInt();

            for(j=1;j<=10;j++)
            {
                System.out.println(num+" * " +j+" = "+num*j);
            }
    
    }
    
}