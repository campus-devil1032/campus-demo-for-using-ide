package org.example.exam230510;

public class Exam01StringExportWithLength {
    public static void main(String[] args) {
        String originalString = "Hello";
        String originalStringWithNew = "Hello World";
        char ch1 = originalString.charAt(0); // 첫 번째 문자열을 추출
        char ch2 = originalString.charAt(1); // 두 번째 문자열을 추출
        int originalStringLength = originalString.length();
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("originalStringLength = " + originalStringLength);
    }
}
