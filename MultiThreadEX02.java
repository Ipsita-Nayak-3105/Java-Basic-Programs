class ChildThread97 implements Runnable {
    public void run() {
        for(int i=0; i <= 50; i++){
        System.out.println("Thread 00001");
        }
    }    
}

class ChildThread96 implements Runnable {
    public void run() {
        for(int i=0; i <= 50; i++){
        System.out.println("Thread 00002");
        }
    }    
}

public class MultiThreadEX02 {
    public static void main(String[] args) {
        ChildThread97 c1 = new ChildThread97();
        ChildThread96 c2 = new ChildThread96();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}