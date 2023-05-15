package org.example.exam230516.exceptions;

// 사용자 정의 예외 클래스 정의
public class MyCustomException extends Exception {
    // 생성자
    public MyCustomException(String message) {
        super(message);
    }

    // 생성자
    public MyCustomException() {
    }
}