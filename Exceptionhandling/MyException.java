public class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }
    
}
  class Papu{
    static   void pass(int marks)throws  MyException{
      if(marks<30){
        throw  new MyException("papu fail  ho gya");
      }
    }
  }



