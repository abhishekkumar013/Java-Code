import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        // command  line
        // System.out.println(args[0]);

        Scanner scan=new Scanner(System.in);
        System.out.print("Entter a Integer Value =");
        int a=scan.nextInt();

        System.out.print("Entter a Float Value =");
        float b=scan.nextFloat();

        System.out.println("A value ="+a);
        System.out.println("FLoat value ="+b);

        // string
        System.out.print("Entter a String Value =");
        // read untill no space after space stop reading
        String str1=scan.next();
        System.out.println(str1);

        // read hole line
        System.out.print("Entter a String Value =");
        // scan.next();
        scan.nextLine();
        String str2=scan.nextLine();
        System.out.println(str2);

        //  character
        System.out.print("Entter a Character Value =");
        char ch=scan.next().charAt(0);
        char ch1=scan.next().charAt(1);
        System.out.println(ch);
        System.out.println(ch1);


        // closed the scanning
        scan.close();
    }
}
