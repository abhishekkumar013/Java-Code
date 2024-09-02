
class thread1 extends Thread{
    public  void start(){
        for(int i=0;i<5;i++){
            System.out.println("Thread1 calling"+i);
        }
    }
}
class thread2 implements Runnable{
    
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("thread2 calling"+i);
        }
    }
    
}
public class MultiThreadiing {
    public static void main(String[] args) {
        thread1 th1=new thread1();
        thread2 th2=new thread2();
        Thread th=new Thread(th2);

        th1.start();
        th.start();
    }
}
