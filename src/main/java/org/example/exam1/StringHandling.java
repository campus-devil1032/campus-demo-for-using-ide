package org.example;

public class StringHandling {
    public static String THIS_IS_STATIC_VARIABLE = "123";

    public static int parseInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char intToChar = str.charAt(i);
            if (intToChar < '0' || intToChar > '9') {
                throw new NumberFormatException("잘못된 숫자 형식입니다.");
            }
            result = result * 10 + (intToChar - '0'); // '0' == 48
        }
        return result;
    }
}

class StringHandlingMain {
    public static void main(String[] args) {
        String str = "123415555";
        int num = StringHandling.parseInt(str);
        System.out.println(num);
    }
}