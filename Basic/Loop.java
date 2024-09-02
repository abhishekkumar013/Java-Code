import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num=scan.nextInt();
        int num2=num;
        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println("while Loop");
        while(num>=0){
            System.out.print(num+" ");
            num--;
        }

        System.out.println("Do while");
        do{
            System.out.print(num2+" ");
            num2--;
        }while (num2>=0); 

        // for each
        System.out.println();
        int arr[]={1,2,3,4,5};
        for(int a:arr){
            System.out.print(a+" ");
        }

        

    }
}
