package inflearn.section1_String;

import java.util.Scanner;

public class _9_숫자만_추출 {
    public int solution(String str) {
        int anwser = 0;

        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                anwser = anwser * 10 + (c - 48);
            }
        }

        return anwser;
    }

    public int solution_2(String str) {
        String anwser = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                anwser += c;
            }
        }

        return Integer.parseInt(anwser);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        _9_숫자만_추출 T = new _9_숫자만_추출();
        System.out.println(T.solution(str));
    }
}
