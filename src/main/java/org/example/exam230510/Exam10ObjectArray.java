package org.example.exam230510;

import org.example.exam230510.model.Student;

public class Exam10ObjectArray {
	public static void main(String[] args) {
		// Student 객체의 배열을 생성
		Student[] students = new Student[3];

		// 배열에 Student 객체를 저장
		students[0] = new Student("John", 20);
		students[1] = new Student("Alice", 21);
		students[2] = new Student("Bob", 19);

		// 모든 학생 정보 출력
		for (Student student : students) {
			student.display();
		}
	}
}