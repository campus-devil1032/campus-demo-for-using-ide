package org.example.exam1;


public class ExamClassMethodVariable {
    final static int thisIsStaticIntVariable = 0;

    static void thisMethodIsNotInstance() {
        System.out.println("thisMethodIsNotInstance() 호출 됨");
        System.out.println(thisIsStaticIntVariable);
    }
}


class ExamClassMethodVariableMain {
    public static void main(String[] args) {
        ExamClassMethodVariable examClassMethodVariable = new ExamClassMethodVariable();
        System.out.println(ExamClassMethodVariable.thisIsStaticIntVariable);
    }

}