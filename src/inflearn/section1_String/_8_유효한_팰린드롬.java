package inflearn.section1_String;

import java.util.Scanner;

public class _8_유효한_팰린드롬 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();

        if (str.equals(temp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        _8_유효한_팰린드롬 T = new _8_유효한_팰린드롬();
        System.out.println(T.solution(str));
    }
}
