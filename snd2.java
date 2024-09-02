//package loop;
import java.util.Scanner;

public class snd2
 {
    public static void main(String[] args) {
        int usernumber=0;
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        do{
            usernumber=sc.nextInt();
            if(usernumber==mynumber)
            {
                System.out.println("Wohhh....Correct!");
                break;
            }else if(usernumber<mynumber)
            {
                System.out.println("Your Number is small");
            }else if(usernumber>mynumber)
            {
                System.out.println("Your Number is large");
            }
        }while(usernumber>=0);
        
    }
    
}
