package org.example.exam230516;

public class Exam03ExceptionHandling {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("나눈 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            // 예외 처리 코드
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        } finally {
            // 항상 실행되는 코드
            System.out.println("예외 처리가 완료되었습니다.");
        }

        System.out.println("try-catch 를 통해 안정적으로 에러 처리를 했으므로 이어서 실행됩니다.");
    }

    // divide 메서드 정의
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
