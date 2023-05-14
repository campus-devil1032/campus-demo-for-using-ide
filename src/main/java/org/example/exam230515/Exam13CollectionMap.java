package org.example.exam230515;

import java.util.*;

public class Exam13CollectionMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println(map.get("Apple")); // 10
        System.out.println(map.get("Banana")); // 20
        System.out.println(map.get("Cherry")); // 30

        // Key set을 순회하며 모든 (키, 값) 쌍을 출력합니다.
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}