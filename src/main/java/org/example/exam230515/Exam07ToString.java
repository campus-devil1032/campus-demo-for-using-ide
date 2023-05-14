package org.example.exam230515;


import org.example.exam230515.model.Exam07PersonType1;
import org.example.exam230515.model.Exam07PersonType2;

public class Exam07ToString {
    public static void main(String[] args) {
        Exam07PersonType1 exam07PersonType1 = new Exam07PersonType1("Harry", 20);
        Exam07PersonType2 exam07PersonType2 = new Exam07PersonType2("Michael", 40);

        String exam07PersonType1String = exam07PersonType1.toString();
        String exam07PersonType2String = exam07PersonType2.toString();
        System.out.println(exam07PersonType1String);
        System.out.println(exam07PersonType2String);

        System.out.println(exam07PersonType1.toString());
        System.out.println(exam07PersonType2.toString());
    }
}
