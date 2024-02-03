package inflearn.section1_String;

import java.util.Scanner;

public class _6_중복문자제거 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _6_중복문자제거 T = new _6_중복문자제거();
        System.out.println(T.solution(str));
    }
}
