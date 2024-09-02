public class LabledLoop {
    public static void main(String[] args) {
        outer:for(int i=0;i<5;i++){
            internal:for(int j=0;j<5;j++){
                System.out.print(j+" ");
                // if(i==3) break; //->diffult internal
                if(i==3) break outer;
            }
            System.out.println();
        }
    }
}
