import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The NUm: ");
            int num=sc.nextInt();
            for(int i=1;i<=10;i++)
            {
                System.out.println(i+" * "+num+" = "+num*i);
            }
        }
    }
}
