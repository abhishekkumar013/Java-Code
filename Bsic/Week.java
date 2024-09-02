import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.println("Enter The Day_NUm: ");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                    System.out.println("Sunaday");
                    break;
            case 2: 
                    System.out.println("Monaday");
                    break;
            case 3:
                   System.out.println("Tuesday");
                   break;
            case 4:
                    System.out.println("Wednesday");
                    break;
            case 5:
                    System.out.println("Thrusday");
                    break;
            case 6:
                   System.out.println("Friday");
                   break;
            case 7:
                    System.out.println("saturady");
                    break;
            default:
                System.out.println("Wrong Input(Give num between 1 to 7)");
        }
    }
}
