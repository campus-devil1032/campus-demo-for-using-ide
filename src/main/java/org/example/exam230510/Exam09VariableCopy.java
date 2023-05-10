package org.example.exam230510;

public class Exam09VariableCopy {
    static void update(int value, StringBuffer bObj) {
        // 기본 타입은 값만 넘어온 상태
        // 여기서 바꿔도 main()에 영향없음
        value = 30;
        // main() 에서 참조 주소를 전달 받은 상태
        // 따라서 main() 안에 있는 객체의 값이 변경 된다.
        bObj.append("world");
    }

    public static void main(String[] args) {
        int value = 20;
        StringBuffer bufferObj = new StringBuffer("Hello ");

        System.out.println("Before update:");
        System.out.println("Value: " + value);
        System.out.println("BufferObj: " + bufferObj);

        update(value, bufferObj);
        
        System.out.println("\nAfter update:");
        System.out.println("Value: " + value);
        System.out.println("BufferObj: " + bufferObj);
    }
}