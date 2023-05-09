package org.example.exam230510;

public class Exam02StringWithNew {

    public static void main(String[] args) {
        String s1 = "JEFF";
        String s2 = "JEFF";
        String s3 = new String("JEFF");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s2 == s3: " + (s2 == s3));

        // new로 생성 된 객체는 스택 영역에 생성 된다.
        // new 없이 생성 된 String은 String constant pool 에서 별도로 관리한다.
        // Heap 영역에 있는 String만을 위한 특별한 공간이다.
    }
}
