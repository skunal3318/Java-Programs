// Creating a thread using runnable interface 

class RunnableThread1 implements Runnable{
    int i = 0 ;
    public void run(){
        while(i<30){
            System.out.println("Runnable thread1...");
            i++;
        }
    }
}

class RunnableThread2 implements Runnable{
    int i = 0;
    public void run(){
        while(i<30){
            System.out.println("Runnable thread2.");
            i++;
        }
    }
}

public class Main{
    public static void main(String[] args){
        RunnableThread1 R1 = new RunnableThread1();
        Thread t1 = new Thread(R1);
        
        RunnableThread2 R2 = new RunnableThread2();
        Thread t2 = new Thread(R2);
        
        t1.start();
        t2.start();
        
    }
}
