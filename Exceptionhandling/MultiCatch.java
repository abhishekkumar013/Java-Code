



public class MultiCatch {
    public static void main(String[] args) {
        try {
            // System.out.println(4/2);
            // System.out.println(4/0); 

            int arr[]={1,2,3};
            System.out.println(arr[4]);
        } catch (ArithmeticException | NullPointerException  e) {
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("Array -> "+e.getMessage());
        }catch(Exception  e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("always execute");
        }
    }
}
