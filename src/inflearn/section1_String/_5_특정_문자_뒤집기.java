package inflearn.section1_String;

import java.util.Scanner;

public class _5_특정_문자_뒤집기 {
    public String solution(String str) {
        String answer = "";

        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char temp = c[rt];
                c[rt] = c[lt];
                c[lt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _5_특정_문자_뒤집기 T = new _5_특정_문자_뒤집기();

        System.out.println(T.solution(str));
    }
}
