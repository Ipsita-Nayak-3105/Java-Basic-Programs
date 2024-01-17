class ChildThread01 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " + i);
        }
    }
}

class ThreadMain3 {
    public static void main(String[] args) {

        ChildThread01 c1 = new ChildThread01();
        c1.start();
    }
}