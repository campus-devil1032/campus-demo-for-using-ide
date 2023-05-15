package org.example.exam230516;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            count--;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class DecrementThread extends Thread {
    private Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}

/**
 * IncrementThread 클래스와 DecrementThread 클래스는 각각 increment() 메서드와 decrement() 메서드를 호출하여 Counter 객체의 공유 자원에 접근합니다.
 * main() 메서드에서는 두 개의 스레드를 생성하고 실행시킨 후, 각 스레드의 실행이 종료될 때까지 join() 메서드를 사용하여 기다립니다.
 * 마지막으로 Counter 객체의 최종 값인 count 변수를 출력합니다.
 * 동기화를 통해 여러 스레드가 안전하게 공유 자원에 접근할 수 있도록 보호하는 방법을 확일할 수 있습니다.
 */
public class Exam07ThreadAdvanced {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        IncrementThread incrementThread = new IncrementThread(counter);
        DecrementThread decrementThread = new DecrementThread(counter);

        incrementThread.start();
        decrementThread.start();

        incrementThread.join();
        decrementThread.join();

        System.out.println("Counter value: " + counter.getCount());
    }
}


/*
 * +-----------------------+---------------------------------------+-------------------------------------------------+
 * |      동기화 방법        |                 설명                    |                     사용법                       |
 * +-----------------------+---------------------------------------+-------------------------------------------------+
 * | synchronized 키워드    | 임계 영역(Critical Section)을            | synchronized (객체 또는 클래스) {           `       |
 * |                       | 지정하여 스레드 간의 경쟁 상황을           |     // 임계 영역에서 수행할 작업                  |
 * |                       | 조절합니다.                             | }                                               |
 * |                       | 스레드가 해당 객체 또는 클래스의           |                                                 |
 * |                       | 모니터 락을 획득하여 동기화를             |                                                 |
 * |                       | 수행합니다.                            |                                                 |
 * +-----------------------+---------------------------------------+-------------------------------------------------+
 * | Lock 인터페이스         | ReentrantLock 클래스 등을 사용하여        | Lock lock = new ReentrantLock();                 |
 * |                       | 임계 영역을 지정합니다.                   | lock.lock();                                    |
 * |                       |                                       | try {                                           |
 * |                       |                                       |     // 임계 영역에서 수행할 작업                  |
 * |                       |                                       | } finally {                                     |
 * |                       |                                       |     lock.unlock();                              |
 * |                       |                                       | }                                               |
 * +-----------------------+---------------------------------------+-------------------------------------------------+
 * | volatile 키워드        | 변수에 대한 가시성(Visibility)을         | private volatile int count;                      |
 * |                       | 보장하고, 스레드 간의 메모리             |                                                 |
 * |                       | 일관성을 유지합니다.                     |                                                 |
 * |                       |                                       |                                                 |
 * |                       |                                       |                                                 |
 * |                       |                                       |                                                 |
 * |                       |                                       |                                                 |
 * +-----------------------+---------------------------------------+-------------------------------------------------+
 * | wait()와 notify()     | 스레드의 대기(Wait)와 통지(Notify)를     | synchronized (객체) {                            |
 * | 메서드                 | 사용하여 스레드 간의 협력적인             |     while (조건) {                              |
 * |                       | 동작을 구현합니다.                      |         객체.wait();                            |
 * |                       | 스레드가 특정 조건을 만족하지 않아        |     }                                           |
 * |                       | 대기 상태로 전환하고, 다른 스레드가       |     // 조건이 만족되면 작업을 수행               |
 * |                       | 조건을 만족시키면 대기 중인 스레드를       |     객체.notify();                              |
 * |                       | 통지하여 실행을 재개합니다.              | }                                               |
 * +-----------------------+---------------------------------------+-------------------------------------------------+
 */