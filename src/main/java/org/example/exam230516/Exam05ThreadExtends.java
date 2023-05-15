package org.example.exam230516;

class MyThread extends Thread {
    public void run() {
        // 스레드가 실행할 작업 정의
    }
}

/**
 * Thread 클래스를 상속받은 사용자 정의 스레드 클래스를 생성합니다.
 * run() 메서드를 오버라이딩하여 스레드가 실행할 작업을 정의합니다.
 * 스레드 객체를 생성하고 start() 메서드를 호출하여 스레드를 실행시킵니다.
 */
public class Exam05ThreadExtends {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}