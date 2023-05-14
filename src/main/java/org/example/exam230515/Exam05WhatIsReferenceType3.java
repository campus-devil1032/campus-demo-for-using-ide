package org.example.exam230515;

public class Exam05WhatIsReferenceType3 {
    public static void main(String[] args) {
        /*
         *
         *  기본 타입의 메모리 값이 서로 다르게 적용되는지 확인해보기 위해 위와 같이 코드를 작성 할 수 있다.
         *  우리가 공부한 내용과는 다르게 메모리 해시값이 동일하게 나오는 것을 볼 수 있다.
         *
         *  `System.identityHashCode()` 메서드는 원래 참조타입에 대한 "시스템 해시코드"를 제공하는 게 그 목적으로 개발 되었다.
         *  따라서 기본타입인 데이터를 이 메서드에 삽입하게 될 경우 Integer와 같은 참조타입으로 자동박싱 된다. (Autoboxing)
         *  박싱 된 두개의 객체 내부에는 "5"라는 int 값이 동일하게 들어 있는 상태인데 이는 JVM 내부적으로 Integer Cache 를 제공해서
         *  같은 값을 재활용한다.
         *
         *  기본타입의 값은 스택영역에 저장되고 참조 타입의 값은 힙 영역에 저장되면서 동시에 이 힙 영역의 주소 값을 스택영역에 저장한다는 점만 기억해두자.
         */

        int primitiveInt1 = 5;
        int primitiveInt2 = primitiveInt1; // primitiveInt1의 값을 복사하여 primitiveInt2에 할당합니다.

        System.out.println("primitiveInt1 hash: " + System.identityHashCode(primitiveInt1)); // primitiveInt1의 해시코드 출력
        System.out.println("primitiveInt2 hash: " + System.identityHashCode(primitiveInt2)); // primitiveInt2의 해시코드 출력

        Integer referenceInt1 = new Integer(5);
        Integer referenceInt2 = referenceInt1; // referenceInt1이 참조하는 객체의 참조를 복사하여 referenceInt2에 할당합니다.

        System.out.println("referenceInt1 hash: " + System.identityHashCode(referenceInt1)); // referenceInt1의 해시코드 출력
        System.out.println("referenceInt2 hash: " + System.identityHashCode(referenceInt2)); // referenceInt2의 해시코드 출력
    }
}