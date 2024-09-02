public class Methods {
    static void  MyMethod(){
        System.out.println("My Method");
    }
    void SumNum(int a,int b){
        System.out.println(a+b);
    }
    int MulNum(int a,int b){
        return a*b;
    }
    float divNum(int a,int b){
        float res=(a/b);
        return res;
    }
    public static void main(String[] args) {
        MyMethod();
        Methods.MyMethod();

        Methods obj=new  Methods();
        obj.SumNum(2,3);

        int mulres=obj.MulNum(2, 3);
        System.out.println(mulres);

        float divres=obj.divNum(4, 3);
        System.out.println(divres);

    }
}
