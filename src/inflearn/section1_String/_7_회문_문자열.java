package inflearn.section1_String;

import java.util.Scanner;

public class _7_회문_문자열 {
    public String solution(String str) {
        String answer = "YES";
        int len = str.length();
        str = str.toUpperCase();

        for (int i = 0; i < len / 2; i++) {
            if (str.indexOf(i) != str.indexOf(len - i - 1)) {
                return "NO";
            }
        }

        return answer;
    }

    public String solution_2(String str) {
        String answer = "YES";
        String temp = new StringBuffer(str).reverse().toString();
        if (!str.equalsIgnoreCase(temp)) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _7_회문_문자열 T = new _7_회문_문자열();
        System.out.println(T.solution(str));
    }
}