package org.example.exam230510;

import java.util.Scanner;

public class Exam04StringSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = scanner.nextLine();

        System.out.print("검색 할 단어 입력: ");
        String searchStr = scanner.nextLine();

        int index = str.indexOf(searchStr);

        if (index != -1) {
            System.out.println("검색 대상 문자열: \"" + searchStr + "\", 찾은 위치: " + index + ", 원본 문자열: \"" + str + "\".");
        } else {
            System.out.println("검색 대상 문자열: \"" + searchStr + "\", 원본 문자열에서 찾을 수 없음, 원본 문자열: \"" + str + "\".");
        }

        scanner.close();
    }
}