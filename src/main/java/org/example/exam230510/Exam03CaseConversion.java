package org.example.exam230510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03CaseConversion {

    public static void main(String[] args) {
        System.out.println("영어 문장 입력");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String userInputString = br.readLine();

            String upperString = userInputString.toUpperCase();
            String lowerString = userInputString.toLowerCase();

            System.out.println("대문자로 변환 : " + upperString);
            System.out.println("소문자로 변환 : " + lowerString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
