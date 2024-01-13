package inflearn.section1_String;

import java.util.Scanner;

public class _2_대소문자_변환 {
    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }

    public String solution_2(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) {
                answer += (char)(x - 32);
            } else {
                answer += (char)(x + 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _2_대소문자_변환 T = new _2_대소문자_변환();
        System.out.println(T.solution(str));
    }
}
