package org.example.exam230510;

import org.example.exam230510.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Exam11ObjectArrayList {
    public static void main(String[] args) {
        // Student 객체의 ArrayList를 생성
        List<Student> students = new ArrayList<>();

        // ArrayList에 Student 객체를 추가
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 21));
        students.add(new Student("Bob", 19));

        // 모든 학생 정보 출력
        for (Student student : students) {
            student.display();
        }
    }
}