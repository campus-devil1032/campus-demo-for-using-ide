package org.example.exam1;

public class ExamConstructorCase2 {
    private int number;

    public ExamConstructorCase2(int number) {
        this.number = number;
    }

    public ExamConstructorCase2() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    static void thisIsStaticMethod() {
        System.out.println("thisIsStaticMethod()를 호출했습니다.");
    }
}

class ExamConstructorCase2Main {
    public static void main(String[] args) {
        ExamConstructorCase2 examConstructorCase2 = new ExamConstructorCase2();

    }
}

