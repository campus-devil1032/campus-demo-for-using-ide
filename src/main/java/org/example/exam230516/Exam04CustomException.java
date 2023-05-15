package org.example.exam230516;


import org.example.exam230516.exceptions.MyCustomException;

// 예외를 발생시키는 메서드 예시
public class Exam04CustomException {
    public static void main(String[] args) {
        try {
            processInput(0);
        } catch (MyCustomException e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void processInput(int value) throws MyCustomException {
        if (value == 0) {
            // early exit
            throw new MyCustomException("0은 입력할 수 없습니다.");
        }

        // value를 처리하는 로직 작성
        System.out.println("처리 중...");
    }
}