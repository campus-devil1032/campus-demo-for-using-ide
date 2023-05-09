package org.example.exam230510;

public class Exam05StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        // 문자열 추가
        sb.append(", World!");
        System.out.println(sb); // "Hello, World!"
        
        // 문자열 삽입
        sb.insert(5, " Java");
        System.out.println(sb); // "Hello Java, World!"
        
        // 문자열 삭제
        sb.delete(5, 9);
        System.out.println(sb); // "Hello, World!"
        
        // 문자열 수정
        sb.replace(7, 12, "Java");
        System.out.println(sb); // "Hello, Java!"
    }
}