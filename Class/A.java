class A {
    public static void main(int x) {
      System.out.println("one arg");
    }
    
    public static void main(int x, int y) {
      System.out.println("two int args");
    }
    
    public static void main(boolean b) {
      System.out.println("bool arg");
    }
    
    public static void main(String[] args) {
      main(false);
      main(1);
      main(2, 3);
      
   }
}