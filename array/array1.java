import java.util.Arrays;
public class array1{
    /**
     * @param args
     */
    public static void main(String[] args) {

        int arr[]=new int[3];
        arr[0]=98;
        arr[1]=96;
        arr[2]=99;
        System.out.println(arr[1]);
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}