package org.example.exam230510;

public class Exam08RaceCondition {
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        };

        Thread thread01 = new Thread(runnable);
        Thread thread02 = new Thread(runnable);
        Thread thread03 = new Thread(runnable);
        Thread thread04 = new Thread(runnable);
        Thread thread05 = new Thread(runnable);
        Thread thread06 = new Thread(runnable);
        Thread thread07 = new Thread(runnable);
        Thread thread08 = new Thread(runnable);
        Thread thread09 = new Thread(runnable);
        Thread thread10 = new Thread(runnable);

        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
        thread05.start();
        thread06.start();
        thread07.start();
        thread08.start();
        thread09.start();
        thread10.start();

        thread01.join();
        thread02.join();
        thread03.join();
        thread04.join();
        thread05.join();
        thread06.join();
        thread07.join();
        thread08.join();
        thread09.join();
        thread10.join();
        System.out.println("Count: " + count);
    }
}