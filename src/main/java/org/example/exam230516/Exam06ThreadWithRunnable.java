package org.example.exam230516;

class MyRunnable implements Runnable {
    public void run() {
        // 스레드가 실행할 작업 정의
    }
}

/**
 * Runnable 인터페이스를 구현한 클래스를 생성합니다.
 * run() 메서드를 구현하여 스레드가 실행할 작업을 정의합니다.
 * 스레드 객체를 생성하고 Thread 클래스의 생성자에 Runnable 객체를 전달하여 스레드를 생성합니다.
 * 생성한 스레드 객체의 start() 메서드를 호출하여 스레드를 실행시킵니다.
 */
public class Exam06ThreadWithRunnable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start(); // run()을 직접 호출하지 않는다. start() 에서 run()을 자동으로 실행시켜 준다.
    }
}