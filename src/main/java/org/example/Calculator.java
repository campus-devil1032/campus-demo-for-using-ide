package org.example;

public class Calculator {
    private int num1;
    private int num2;
    private char op;

    public Calculator() {
    }

    public Calculator(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public void calculate() {
        int result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자네요 ^-^...");
                return;

        }
        if (!validNumberRange(123)) {
            throw new IllegalArgumentException("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요");
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }

    public char getOp() {
        return op;
    }

    public boolean validNumberRange(int number) {
        return number >= 1 && number <= 999;
    }

}