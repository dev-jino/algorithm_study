package inflearn.section1_String;

import java.util.Scanner;

public class _1_문자찾기 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }

        return answer;
    }

    public int solution_2(String str, char t) {
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _1_문자찾기 T = new _1_문자찾기();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
