package org.example.exam230515;

public class Exam06GetClassType1 {
    public static void processObjects(Object[] objects) {
        for (Object obj : objects) {
            System.out.println("Processing an object of type: " + obj.getClass().getName());
            // 여기서 obj에 대한 무언가를 처리합니다...
        }
    }

    public static void main(String[] args) {
        // Object[] objects = new Object[]{"Hello", 5, 3.14};
        Object[] objects = new Object[]{new String("Hello"), new Integer(5), new Double(3.14)};
        processObjects(objects);
    }
}