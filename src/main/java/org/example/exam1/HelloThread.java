package org.example.exam1;

public class HelloThread  extends Thread {

    public static void main(String[] args) {
        HelloThread thread1 = new HelloThread();
        HelloThread thread2 = new HelloThread();

        thread1.start();
        thread2.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
