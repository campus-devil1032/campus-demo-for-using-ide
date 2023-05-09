package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamClassLibrary {
    public static void main(String[] args) throws IOException {
        System.out.println("정수 입력 하세요");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine();

        try {
            int num = Integer.parseInt(userInput);
            System.out.println("유저가 입력 한 문자열은 숫자입니다." + num);
        } catch (NumberFormatException e) {
            System.out.println("유저가 입력 한 문자열은 숫자가 아닙니다." + userInput);
        }
    }
}
