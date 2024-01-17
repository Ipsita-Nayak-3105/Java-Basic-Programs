class ChildThread99 extends Thread {
    // @Override
    public void run() {
        int i = 0;
        while(i <= 40){
            System.out.println("My cooking Thread is running");
            System.out.println("I am definitly not Happy");
            i++;
        }
    }
}

class ChildThread98 extends Thread {
    // @Override
    public void run() {
        int i = 0;
        while(i <= 40){
            System.out.println("running");
            System.out.println("Happy");
            i++;
        }
    }
}

public class MultiThreadEX {
    public static void main(String[] args) {
        ChildThread99 c1 = new ChildThread99();
        ChildThread98 c2 = new ChildThread98();
        c1.start();
        c2.start();
    }
}