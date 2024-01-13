package inflearn.section1_String;

import java.util.Scanner;

public class _3_문장_속_단어 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public String solution_2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        if (str.length() > m) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        _3_문장_속_단어 T = new _3_문장_속_단어();
        System.out.println(T.solution(str));
    }
}
