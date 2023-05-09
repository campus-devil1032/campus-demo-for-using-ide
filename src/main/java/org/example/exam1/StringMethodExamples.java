package org.example.exam1;

public class StringMethodExamples {
    public static void main(String[] args) {
        // length()
        String str1 = "Hello, World!";
        int length = str1.length();
        System.out.println("문자열의 길이: " + length); // 출력: 문자열의 길이: 13

        // charAt()
        char ch = str1.charAt(1);
        System.out.println("인덱스 1의 문자: " + ch); // 출력: 인덱스 1의 문자: e

        // concat()
        String str2 = "Java";
        String str3 = str1.concat(str2);
        System.out.println("두 문자열을 합친 결과: " + str3); // 출력: 두 문자열을 합친 결과: Hello, World!Java

        // equals()
        String str4 = "Hello, World!";
        boolean isEqual = str1.equals(str4);
        System.out.println("두 문자열이 같은지 여부: " + isEqual); // 출력: 두 문자열이 같은지 여부: true

        // indexOf()
        int index = str1.indexOf('o');
        System.out.println("문자 o가 처음 등장하는 위치: " + index); // 출력: 문자 o가 처음 등장하는 위치: 4

        // substring()
        String subStr = str1.substring(0, 5);
        System.out.println("0부터 5 이전까지의 문자열: " + subStr); // 출력: 0부터 5 이전까지의 문자열: Hello

        // toLowerCase()
        String lowerCaseStr = str1.toLowerCase();
        System.out.println("소문자로 변경한 결과: " + lowerCaseStr); // 출력: 소문자로 변경한 결과: hello, world!

        // toUpperCase()
        String upperCaseStr = str1.toUpperCase();
        System.out.println("대문자로 변경한 결과: " + upperCaseStr); // 출력: 대문자로 변경한 결과: HELLO, WORLD!

        // trim()
        String str5 = "   Hello, World!   ";
        String trimmedStr = str5.trim();
        System.out.println("공백을 제거한 결과: " + trimmedStr); // 출력: 공백을 제거한 결과: Hello, World!

        // contains()
        boolean containsStr2 = str1.contains(str2);
        System.out.println("문자열에 Java가 포함되어 있는지 여부: " + containsStr2); // 출력: 문자열에 Java가 포함되어 있는지 여부: true

        // endsWith()
        boolean endsWithStr2 = str1.endsWith(str2);
        System.out.println("문자열이 Java로 끝나는지 여부: " + endsWithStr2); // 출력: 문자열이 Java로 끝나는지 여부: false

        // startsWith()
        boolean startsWithHello = str1.startsWith("Hello");
        System.out.println("문자열이 Hello로 시작하는지 여부: " + startsWithHello); // 출력: 문자열이 Hello로 시작하는지 여부: true

        // replace()
        String replacedStr = str1.replace('o', '0');
        System.out.println("o를 0으로 변경한 결과: " + replacedStr);

        // split()
        String str6 = "Java is a programming language";
        String[] arr = str6.split(" ");
        System.out.println("공백을 기준으로 나눈 문자열 배열: ");
        for (String s : arr) {
            System.out.println(s);
        }
        // 출력:
        // 공백을 기준으로 나눈 문자열 배열:
        // Java
        // is
        // a
        // programming
        // language

        // matches()
        String regex = ".*is.*";
        boolean matches = str6.matches(regex);
        System.out.println("문자열이 정규식과 일치하는지 여부: " + matches); // 출력: 문자열이 정규식과 일치하는지 여부: true

        // valueOf()
        int num = 123;
        String str9 = String.valueOf(num);
        System.out.println("정수를 문자열로 변환한 결과: " + str9); // 출력: 정수를 문자열로 변환한 결과: 123
    }
}
