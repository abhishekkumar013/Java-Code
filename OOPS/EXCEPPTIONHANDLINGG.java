public class EXCEPPTIONHANDLINGG {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        System.out.println("Hello");
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("By");
    }
}
