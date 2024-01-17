class ChildThread95 extends Thread {
    public ChildThread95(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 7; i++) {
            System.out.println("Thread 1");
        }
    }
}

class ChildThread94 extends Thread {
    public ChildThread94(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 7; i++) {
            System.out.println("Thread 2");
        }
    }
}

class ChildThread93 extends Thread {
    public ChildThread93(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 7; i++) {
            System.out.println("Thread 3");
        }
    }
}

public class ConstrThread {
    public static void main(String[] args) {
        ChildThread95 c1 = new ChildThread95("Shekhar");
        ChildThread94 c2 = new ChildThread94("Ipsita");
        ChildThread93 c3 = new ChildThread93("Jeypore");
        c1.start();
        c2.start();
        c3.start();
        System.out.println("The name of the thread c1 is" + " " + c1.getName());
        System.out.println("The id of the thread c1 is" + " " + c1.getId());
        System.out.println("The name of the thread c2 is" + " " + c2.getName());
        System.out.println("The id of the thread c2 is" + " " + c2.getId());
        System.out.println("The name of the thread c3 is" + " " + c3.getName());
        System.out.println("The id of the thread c3 is" + " " + c3.getId());

    }
}

// package com.company;

// class MyThr extends Thread {
// public MyThr(String name) {
// super(name);
// }

// public void run() {
// // int i = 34;
// System.out.println("Thank you");
// // while(true){
// // System.out.println("I am a thread");
// // }
// }
// }

// public class ConstrThread {
// public static void main(String[] args) {
// MyThr t1 = new MyThr("Harry");
// MyThr t2 = new MyThr("Ram Candr");
// t1.start();
// t2.start();
// System.out.println("The id of the thread t is " + t1.getId());
// System.out.println("The name of the thread t is " + t1.getName());
// System.out.println("The id of the thread t is " + t2.getId());
// System.out.println("The name of the thread t is " + t2.getName());

// }
// }
