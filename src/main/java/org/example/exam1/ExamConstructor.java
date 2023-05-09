package org.example.exam1;

public class ExamConstructor {

    private int sampleNumber;

    private ExamConstructor() {
        System.out.println("ExamConstructor 클래스의 생성자가 호출되었습니다.");
        System.out.println("ExamConstructor 클래스의 생성자가 호출되었습니다.");
        System.out.println("ExamConstructor 클래스의 생성자가 호출되었습니다.");
        System.out.println("ExamConstructor 클래스의 생성자가 호출되었습니다.");

    }

    public ExamConstructor(double sampleNumber) {
        this(123);
        this.sampleNumber = (int) sampleNumber;
    }

    public ExamConstructor(int sampleNumber) {
        this();
        this.sampleNumber = sampleNumber;
    }

    public void initializer() {
        sampleNumber = 100;
    }

    public int getSampleNumber() {
        System.out.println("getSampleNumber()가 호출되었습니다.");
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        System.out.println("setSampleNumber()가 호출되었습니다.");
        this.sampleNumber = sampleNumber;
    }
}

class ExamConstructorMain {
    public static void main(String[] args) {
        ExamConstructor examConstructor1 = new ExamConstructor(1);
        ExamConstructor examConstructor2 = new ExamConstructor(2);
        ExamConstructor examConstructor3 = new ExamConstructor(3);
        ExamConstructor examConstructor4 = new ExamConstructor(4);
    }
}
