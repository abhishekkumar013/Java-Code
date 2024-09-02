import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ener Nuber: ");
        int a=scan.nextInt();
        if(a>=1000 &  a<100000){
            System.out.println("4 digit");
        }
        else if(a>100 && a<1000){
            System.out.println("3 digit");

        }
        else if(a>=10 | a<=99 || a==50){
            System.out.println("2 digit");

        }else{
            System.out.println("1 digit");
        }

    }
}
