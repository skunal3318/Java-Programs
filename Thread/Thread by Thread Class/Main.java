// Creating a thread using a thread class

class Thread1 extends Thread{
    int i = 0;
    public void run()
    {
        while(i<400){
            System.out.println("Running thread1....");
            i++;
        }
    }
}

class Thread2 extends Thread{
    int i = 0;
    public void run(){
        while(i<400){
            System.out.println("Running thread2...");
            i++;
        }
    }
}
class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}


