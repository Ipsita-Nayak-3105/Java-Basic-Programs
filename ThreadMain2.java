class Child implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }
    }
}

public class ThreadMain2 {

    public static void main(String[] args) {
        Child c1 = new Child();
        Thread t1 = new Thread(c1);
        t1.start();
        
}
}