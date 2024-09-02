import java.util.Scanner;

import javax.lang.model.type.NullType;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=0;i<5;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print("*");
            }
            n--;
            System.out.println("\n");
        }
    }
    
}
