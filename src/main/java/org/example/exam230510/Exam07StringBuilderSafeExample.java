package org.example.exam230510;

public class Exam07StringBuilderSafeExample {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (sb) {
                    sb.append("a");
                }
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
        Thread thread11 = new Thread(runnable);
        Thread thread12 = new Thread(runnable);
        Thread thread13 = new Thread(runnable);
        Thread thread14 = new Thread(runnable);
        Thread thread15 = new Thread(runnable);
        Thread thread16 = new Thread(runnable);
        Thread thread17 = new Thread(runnable);
        Thread thread18 = new Thread(runnable);
        Thread thread19 = new Thread(runnable);
        Thread thread20 = new Thread(runnable);

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
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();
        thread15.start();
        thread16.start();
        thread17.start();
        thread18.start();
        thread19.start();
        thread20.start();

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
        thread11.join();
        thread12.join();
        thread13.join();
        thread14.join();
        thread15.join();
        thread16.join();
        thread17.join();
        thread18.join();
        thread19.join();
        thread20.join();

        System.out.println(sb.length()); // 예상 결과: 20000, 실제 결과: 20000
    }
}