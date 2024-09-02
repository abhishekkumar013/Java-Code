public class TypeCasting {

    public static void main(String[] args) {
        // Automatic Catsing-wide casting
        float fvar=23.24f;
        double dvar=fvar;
        System.out.println(dvar);

        // manual
        long lvar=(long)dvar;
        System.out.println(lvar);


        // Advance
        // int,float,loong,double->string
        // string-> float,int,log double ,json parsing
        int a=2;
        String str=String.valueOf(a);
        System.out.println("a + a = " + (a + a));
        System.out.println("Str "+(str));
        System.out.println("Str+STr= "+(str+str));

        // non-permeive to premitive
        String str1="22";
        int num=Integer.parseInt(str1);
        System.out.println(num+num);
        float f1=Float.parseFloat(str1);
        System.out.println(f1);
    }
}